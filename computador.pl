es_un_sintoma(un_pitido_corto).
es_un_sintoma(dos_pitidos_cortos).
es_un_sintoma(nueve_pitidos_crotos).
es_un_sintoma(once_pitidos_cortos).
es_un_sintoma(se_reinicia).
es_un_sintoma(se_reinica_al_poco_rato_de_arrancar_la_maquina).
es_un_sintoma(sobrecalentamiento).
es_un_sintoma(drivers_desactualizados).

sintoma_de(un_pitido_corto,error_en_el_refresco_de_la_ram).
sintoma_de(dos_pitidos_cortos,error_en_el_circuito_de_partida).
sintoma_de(nueve_pitidos_crotos,error_en_el_controlador_del_teclado).
sintoma_de(once_pitidos_cortos, error_en_la_memoria_cache).
sintoma_de(se_reinicia, el_procesador_se_sobrecalienta_necesita_cambio_de_pasta_termica_y_limpieza_de_procesador).
sintoma_de(se_reinica_al_poco_rato_de_arrancar_la_maquina,sobrecalentamiento).
sintoma_de(drivers_desactualizados, falla_de_entradas_usb_letras_e_iconos_de_pantalla_grandes).
tiene(virus, mensaje_de_errores_y_pc_lenta).

corregir(sobrecalentamiento, cambiar_pasta_termica_y_limpieza_de_ventilador).
corregir(drivers_desactualizados, menu_inicio_clic_derecho_administrar_dispositivos_y_seleccionar_el_driver_a_actualizar).
corregir(fallas_de_sistema_operativo, usar_disco_de_imagen_o_punto_de_restauracion_creada).

se_puede_prevenir(fallas_de_sistema_operativo, realizar_actualizaciones_de_software).
se_puede_prevenir(archivos_basura, eliminacion_de_archivos_temporales_e_innecesarios).
se_puede_prevenir(perdida_de_informacion, crear_punto_de_restauracion_cada_determinado_tiempo).
se_puede_prevenir(virus, actualizando_Antivirus_o_instalar_uno).


es_buena_marca(hp).
es_buena_marca(acer).
es_buena_marca(asus).
es_buena_marca(dell).
es_buena_marca(lenovo).
es_buena_marca(sumsung).
es_buena_marca(lanix).

es_recomendable(lenovo, es_recomendable_casi_nunca_falla_de_fabrica).
es_recomendable(dell, es_recomendable_casi_nunca_falla_de_fabrica).
es_recomendable(samsung, es_recomendable_casi_nunca_falla_de_fabrica).
es_recomendable(acer, es_recomendable_casi_nunca_falla_de_fabrica).

es_recomendable(hp, no_porque_falla_de_fabrica_segun_las_estadisticas).
es_recomendable(asus, no_porque_falla_de_fabrica_segun_las_estadisticas).
es_recomendable(lanix, no_porque_falla_de_fabrica_segun_las_estadisticas).

problema_de(X,Y):-es_un_sintoma(X),sintoma_de(X,Y).
solucion_de(X,Y):-corregir(X,Y),es_un_sintoma(X).
como_prevenir(X,Y):-se_puede_prevenir(X,Y).
es_recomendable_marca(X,Y):-es_buena_marca(X),es_recomendable(X, Y).
detectar_virus(X,Y):-tiene(X,Y); se_puede_prevenir(X,Y).
