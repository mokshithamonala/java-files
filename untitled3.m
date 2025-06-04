A=[2 0,0 3];
theta=linspace(0,2*pi,100);
x=cos(theta);
y=sin(theta);
circle=[x;y];
transformed=A*circle;
figure;
subplot(1,2,1);
plot(circle(1,:),circle(2,:));
title('unit circle');
axis equal;
subplot(1,2,2);
plot(transformed(1,:),transformed(2,:));
title('transformed circle');
axis equal;


