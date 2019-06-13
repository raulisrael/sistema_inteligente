padre(juan,pedro).
padre(josé,pedro).
padre(maría,pedro).
padre(pedro,pablo).
padre(ana,alberto).

madre(juan,ana).
madre(josé,ana).
madre(maría,ana).
madre(pedro,juanita).
madre(ana,julia).

media(X,Y,M):-M is (X+Y)/2.

fact(0,1).
  fact(N,F) :- N>0,
               Nmenos1 is N-1,
               fact(Nmenos1,F1),
               F is N*F1.
