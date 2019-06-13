es_un_sintoma(un_pitido_corto).
es_un_sintoma(dos_pitidos_cortos).
es_un_sintoma(nueve_pitidos_cortos).
es_un_sintoma(once_pitidos_cortos).


sintoma_de(un_pitido_corto, error_en_el_refresco_de_la_RAM).
sintoma_de(dos_pitidos_cortos, error_en_el_circuito_de_paridad).
sintoma_de(nueve_pitidos_cortos, error_en_el_controlador_del_teclado).
sintoma_de(once_pitidos_cortos, error_en_la_memoria_cache).

padre(antonio, carlos).
padre(antonio, eva).
padre(carlos, fernando).
padre(carlos, silvia).
padre(david, emilio).
padre(emilio, jazmin).
padre(emilio, juan).
padre(fernando, fernando).

madre(maria, carlos).
madre(maria, eva).
madre(elena, fernando).
madre(elena, silvia).
madre(eva, emilio).
madre(rosi, jazmin).
madre(rosi, juan).

abuelo(A,B) :- padre(A,X), padre(X,B).

problema_de(X,Y):-es_un_sintoma(X),sintoma_de(X,Y).
