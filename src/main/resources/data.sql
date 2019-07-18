insert into horarios_cita values(1, '08:00 - 09:00');
insert into horarios_cita values(2, '09:00 - 10:00');
insert into horarios_cita values(3, '10:00 - 11:00');
insert into horarios_cita values(4, '11:00 - 12:00');
insert into horarios_cita values(5, '12:00 - 13:00');
insert into horarios_cita values(6, '14:00 - 15:00');
insert into horarios_cita values(7, '15:00 - 16:00');
insert into horarios_cita values(8, '16:00 - 17:00');
insert into horarios_cita values(9, '17:00 - 18:00');
insert into horarios_cita values(10, '18:00 - 19:00');
insert into horarios_cita values(11, '19:00 - 20:00');

insert into paciente(identificacion, nombres_Apellidos, fecha_Nacimiento,sexo, direccion, telefono, email)
            values('1756520000', 'Pedro Maldonado', PARSEDATETIME('13-APR-17 10.49.36.558000000 PM','dd-MMM-yy hh.mm.ss.SSS a','en')
, 'Masculino', 'Quito', '0222345436', 'pmaldonado@gmail.com');