padre(juan,pedro).
padre(jos�,pedro).
padre(mar�a,pedro).
padre(pedro,pablo).
padre(ana,alberto).

madre(juan,ana).
madre(jos�,ana).
madre(mar�a,ana).
madre(pedro,juanita).
madre(ana,julia).

media(X,Y,M):-M is (X+Y)/2.

fact(0,1).
  fact(N,F) :- N>0,
               Nmenos1 is N-1,
               fact(Nmenos1,F1),
               F is N*F1.
