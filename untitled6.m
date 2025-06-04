clc;
clear;
A=input('Enter your matrix');
[m,n]=size(A);
if m~=n
    error('the matrix should be a square for diagonalization');
end
[p,D]=eig(A);
eigenvalues=diag(D);
disp('Eigenvalues:');
disp(eigenvalues);
disp('Eigenvectors(column of p):');
disp(p);
  if rank(p)==m
    disp('matrix is diagonalisable');
    disp(p);
    disp('inverse of p:');
    invp=inv(p);
    disp(invp);
    diagonal_matrix=inv(p)*A*p;
    disp('daigonalmatrix(inv(p)*A*p):');
    disp(diagonal_matrix);
else
    disp('Matrix is not diagonalisable not enough linearly independent terms');
end
