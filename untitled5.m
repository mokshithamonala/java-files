

A = [1 0.5; -0.5 1];
triangle = [0 1 0.5 0; 0 0 1 0];  % Corrected 'traingle' to 'triangle'

transformed = A * triangle;

figure;

subplot(1,2,1);
fill(triangle(1,:), triangle(2,:), 'g');
title('Original');
axis equal;

subplot(1,2,2);
fill(transformed(1,:), transformed(2,:), 'b');
title('Transformed');
axis equal;
