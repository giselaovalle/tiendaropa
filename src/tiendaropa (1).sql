-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 29-08-2021 a las 19:24:23
-- Versión del servidor: 10.4.18-MariaDB
-- Versión de PHP: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `tiendaropa`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `auditoria`
--

CREATE TABLE `auditoria` (
  `idAuditoria` int(11) NOT NULL,
  `descripcionAuditoria` varchar(77) NOT NULL,
  `fechaAuditoria` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `auditoria`
--

INSERT INTO `auditoria` (`idAuditoria`, `descripcionAuditoria`, `fechaAuditoria`) VALUES
(1, 'Se Insertó Cliente', '2020-04-17 21:24:49'),
(2, 'Se Modificó Cliente', '2020-04-17 21:24:56'),
(3, 'Se Eliminó Cliente', '2020-04-17 21:25:01'),
(4, 'Se Insertó Cliente', '2020-04-17 21:25:08'),
(5, 'Se Eliminó Cliente', '2020-04-17 21:25:10'),
(6, 'Se Insertó Compra', '2020-04-17 21:25:35'),
(7, 'Se Eliminó Compra', '2020-04-17 21:25:45'),
(8, 'Se Insertó Cliente', '2020-04-22 21:37:02'),
(9, 'Se Insertó Compra', '2020-04-22 23:29:40'),
(10, 'Se Modificó Compra', '2020-04-22 23:29:50'),
(11, 'Se Insertó Compra', '2020-04-22 23:30:00'),
(12, 'Se Insertó Cliente', '2021-08-04 17:37:10'),
(13, 'Se Insertó Cliente', '2021-08-04 17:40:01'),
(14, 'Se Insertó Usuario', '2021-08-04 17:43:16'),
(15, 'Se Insertó Usuario', '2021-08-04 17:43:23'),
(16, 'Usuario inicio sesion', '2021-08-04 17:43:48'),
(17, 'Usuario inicio sesion', '2021-08-04 17:43:49'),
(18, 'Usuario inicio sesion', '2021-08-04 17:43:51'),
(19, 'Usuario inicio sesion', '2021-08-04 17:43:52'),
(20, 'Usuario inicio sesion', '2021-08-04 17:43:53'),
(21, 'Usuario inicio sesion', '2021-08-04 17:43:55'),
(22, 'Se Insertó Cliente', '2021-08-04 17:49:32'),
(23, 'Se Insertó Compra', '2021-08-04 17:50:11'),
(24, 'Se Insertó Empleado', '2021-08-04 17:53:47'),
(25, 'Se Modificó Empleado', '2021-08-04 17:55:19'),
(26, 'Se Modificó Empleado', '2021-08-04 17:56:24'),
(27, 'Se Modificó Empleado', '2021-08-04 17:56:57'),
(28, 'Se Modificó Empleado', '2021-08-04 17:57:19'),
(29, 'Se Insertó Usuario', '2021-08-04 17:59:23'),
(30, 'Usuario inicio sesion', '2021-08-04 17:59:50'),
(31, 'Usuario inicio sesion', '2021-08-04 17:59:51'),
(32, 'Usuario inicio sesion', '2021-08-04 17:59:51'),
(33, 'Usuario inicio sesion', '2021-08-04 17:59:52'),
(34, 'Usuario inicio sesion', '2021-08-04 17:59:52'),
(35, 'Usuario inicio sesion', '2021-08-04 17:59:54'),
(36, 'Usuario inicio sesion', '2021-08-04 17:59:54'),
(37, 'Usuario inicio sesion', '2021-08-04 18:03:44'),
(38, 'Usuario inicio sesion', '2021-08-04 18:03:46'),
(39, 'Usuario inicio sesion', '2021-08-04 18:03:47'),
(40, 'Usuario inicio sesion', '2021-08-04 18:03:48'),
(41, 'Se Insertó Usuario', '2021-08-25 22:16:58'),
(42, 'Usuario inicio sesion', '2021-08-25 22:17:28'),
(43, 'Usuario inicio sesion', '2021-08-25 22:17:31'),
(44, 'Usuario inicio sesion', '2021-08-25 22:17:34'),
(45, 'Usuario inicio sesion', '2021-08-25 22:17:36'),
(46, 'Usuario inicio sesion', '2021-08-25 22:17:37'),
(47, 'Usuario inicio sesion', '2021-08-25 22:17:39'),
(48, 'Usuario inicio sesion', '2021-08-25 22:17:42'),
(49, 'Usuario inicio sesion', '2021-08-25 22:17:44'),
(50, 'Usuario inicio sesion', '2021-08-25 22:31:46'),
(51, 'Usuario inicio sesion', '2021-08-25 22:31:47'),
(52, 'Usuario inicio sesion', '2021-08-25 22:31:50'),
(53, 'Se Insertó Cliente', '2021-08-29 01:56:39'),
(54, 'Se Insertó Cliente', '2021-08-29 01:57:07'),
(55, 'Se Insertó Cliente', '2021-08-29 02:28:26'),
(56, 'Se Modificó Cliente', '2021-08-29 02:28:46'),
(57, 'Se Modificó Cliente', '2021-08-29 02:29:29'),
(58, 'Se Eliminó Cliente', '2021-08-29 02:29:40'),
(59, 'Se Insertó Compra', '2021-08-29 02:32:34'),
(60, 'Se Insertó Compra', '2021-08-29 02:32:54'),
(61, 'Se Modificó Compra', '2021-08-29 02:33:06'),
(62, 'Se Eliminó Compra', '2021-08-29 02:33:13'),
(63, 'Se Insertó Empleado', '2021-08-29 03:55:43'),
(64, 'Se Insertó Empleado', '2021-08-29 03:57:14'),
(65, 'Se Modificó Empleado', '2021-08-29 03:58:47'),
(66, 'Se Insertó Empleado', '2021-08-29 03:59:21'),
(67, 'Se Eliminó Empleado', '2021-08-29 03:59:28'),
(68, 'Se Insertó Cliente', '2021-08-29 14:41:16');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bodega`
--

CREATE TABLE `bodega` (
  `idBodega` int(11) NOT NULL,
  `codigoBodega` varchar(45) DEFAULT NULL,
  `idProductoBodega` int(11) DEFAULT NULL,
  `cantidadBodega` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `bodega`
--

INSERT INTO `bodega` (`idBodega`, `codigoBodega`, `idProductoBodega`, `cantidadBodega`) VALUES
(13, '667', 8, 20),
(14, '1', 10, 30),
(15, 't2654', 12, 2),
(16, '2', 8, 99);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `idCliente` smallint(6) NOT NULL,
  `nombreCliente` varchar(255) NOT NULL,
  `documentoCliente` varchar(255) NOT NULL,
  `direccionCliente` varchar(255) NOT NULL,
  `celularCliente` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`idCliente`, `nombreCliente`, `documentoCliente`, `direccionCliente`, `celularCliente`) VALUES
(12, 'Ana Maria Perez', '107678977', 'Tunja', '3232474563'),
(16, 'Dayana Rosa', '1007678978', 'Moniquira', '123445566'),
(17, 'Flor Peña', '63987567', 'Vélez', '3202698846'),
(22, 'Edith Fransica', '2345663', 'Bogotá', '789-4567-78'),
(26, 'Alberto Ramirez', '4567', 'Bogotá', '34'),
(27, 'juan', '565465457', 'bucaramanga', '3136234567'),
(28, 'Edwin Marinez', '83252596', 'carrera#1 108', '3203317421');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compra`
--

CREATE TABLE `compra` (
  `idCompra` int(11) NOT NULL,
  `idClienteCompra` smallint(6) NOT NULL,
  `idProductoCompra` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `compra`
--

INSERT INTO `compra` (`idCompra`, `idClienteCompra`, `idProductoCompra`) VALUES
(1, 16, 4),
(2, 22, 9),
(3, 17, 5),
(6, 17, 1),
(7, 26, 1),
(8, 89, 9),
(9, 16, 9),
(10, 16, 9);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `idEmpleado` int(11) NOT NULL,
  `nombreEmpleado` varchar(45) NOT NULL,
  `apellidoEmpleado` varchar(45) NOT NULL,
  `edadEmpleado` varchar(100) NOT NULL,
  `salarioEmpleado` varchar(100) NOT NULL,
  `correoEmpleado` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`idEmpleado`, `nombreEmpleado`, `apellidoEmpleado`, `edadEmpleado`, `salarioEmpleado`, `correoEmpleado`) VALUES
(5, 'Andres ', 'Rodriguez', '39', '906000', 'andres@gmail.com'),
(20, 'Ana ', 'Barbosa ', '19', '906000', 'ana@gmail.com'),
(27, 'Jose', ' Velasco', '45', '906000', 'jesus899@gmail.com'),
(28, 'darci', 'amado', '18', '906000', 'darci@gmail.com'),
(29, 'Antonio', 'Ortiz', '23', '906000', 'Ortiz@gmail.com'),
(30, 'felipe', 'Rodriguez', '24', '1500000', 'hggf@gmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `idPedido` int(11) NOT NULL,
  `idProveedorPedido` int(11) DEFAULT NULL,
  `idProductoPedido` int(11) DEFAULT NULL,
  `fechaPedido` timestamp NULL DEFAULT current_timestamp(),
  `observacionPedido` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pedido`
--

INSERT INTO `pedido` (`idPedido`, `idProveedorPedido`, `idProductoPedido`, `fechaPedido`, `observacionPedido`) VALUES
(11, 7, 10, '2021-08-04 17:58:08', 'en buen estado'),
(12, 7, 9, '2021-08-29 02:19:18', 'buen estado'),
(13, 7, 12, '2021-08-29 04:02:03', 'buen estado'),
(14, 9, 13, '2021-08-29 04:04:00', 'mal estado'),
(15, 9, 13, '2021-08-29 04:04:23', 'en mal estado');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idProducto` int(11) NOT NULL,
  `nombreProducto` varchar(45) DEFAULT NULL,
  `pesoProducto` int(11) DEFAULT NULL,
  `idProveedor_Producto` int(11) NOT NULL,
  `idTipo_Producto` int(11) NOT NULL,
  `precioProducto` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idProducto`, `nombreProducto`, `pesoProducto`, `idProveedor_Producto`, `idTipo_Producto`, `precioProducto`) VALUES
(8, 'Short', 6543, 7, 5, 78000),
(9, 'Blusa', 7654, 9, 6, 45000),
(10, 'Traje', 67890, 8, 7, 67000),
(11, 'Blusa', 7654, 9, 6, 45000),
(12, 'Traje', 67890, 8, 7, 67000),
(13, 'Jean', 7654, 9, 5, 7654),
(14, 'Jean', 7654, 9, 5, 6543),
(15, 'fcxz', 560, 8, 7, 2345678),
(17, 'zapatos', 234, 7, 7, 35000),
(18, 'vestido rojos', 870, 7, 9, 450000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `idProveedor` int(11) NOT NULL,
  `nombreProveedor` varchar(77) NOT NULL,
  `RUTProveedor` varchar(77) NOT NULL,
  `telefonoProveedor` varchar(77) NOT NULL,
  `direccionProveedor` varchar(77) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`idProveedor`, `nombreProveedor`, `RUTProveedor`, `telefonoProveedor`, `direccionProveedor`) VALUES
(7, 'Luis Perez', '56789', '345678', 'Moniquira'),
(8, 'Edith Garces', '876543', '3132532617', 'Moniquira,Boyaca'),
(9, 'Carmen Garces', '876543', '876543', 'Tunja,Boyaca'),
(10, 'susana Gomez', '236545', '3243456567', 'Bogota');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rol`
--

CREATE TABLE `rol` (
  `id` int(11) NOT NULL,
  `descripcion` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `rol`
--

INSERT INTO `rol` (`id`, `descripcion`) VALUES
(1, 'Administrador'),
(2, 'Usuario');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo`
--

CREATE TABLE `tipo` (
  `idTipo` int(11) NOT NULL,
  `descripcionTipo` varchar(55) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tipo`
--

INSERT INTO `tipo` (`idTipo`, `descripcionTipo`) VALUES
(5, 'Jean'),
(6, 'Blusas escotadas'),
(7, 'Elegante'),
(8, 'blusa'),
(9, 'vestido');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `idUsuario` int(11) NOT NULL,
  `nombreUsuario` varchar(45) NOT NULL,
  `cedulaUsuario` varchar(45) NOT NULL,
  `correoUsuario` varchar(45) NOT NULL,
  `telefonoUsuario` varchar(45) NOT NULL,
  `contrasenaUsuario` varchar(45) NOT NULL,
  `rolUsuario` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`idUsuario`, `nombreUsuario`, `cedulaUsuario`, `correoUsuario`, `telefonoUsuario`, `contrasenaUsuario`, `rolUsuario`) VALUES
(1, 'Edith Garces', '123456789', 'edith56@gmail.com', '3232474563', '12345678', 'Administrador'),
(3, 'Victor Peña', '123545', 'victor56@gmail.com', '234356', 'hila', 'Empleado'),
(4, 'Arnoldo Ramirez', '1234', 'arnold@gmail.com', '23551246', '531ae4a0b287e230303c470af278617f6cd3eb13', 'Empleado'),
(5, 'Luis Perez', '123456789', 'lul@gmail.com', '3232474563', 'da39a3ee5e6b4b0d3255bfef95601890afd80709', 'Administrador'),
(6, 'Julio Suarez', '130042854', 'Julion@gmail.com', '----', '20eabe5d64b0e216796e834f52d61fd0b70332fc', 'Cliente'),
(7, 'Laura Pinzón', '234554', 'laura@gmail.com', '3123454578', '99800b85d3383e3a2fb45eb7d0066a4879a9dad0', 'Cliente Premium'),
(8, 'Oscar Gonzalez', '1234567', 'os.hon@gmail.com', '00000000000', '8cb2237d0679ca88db6464eac60da96345513964', 'Administrador'),
(9, 'Ana Lopez', '2346572', 'ana6789@gmail.com', '765432', 'cc4723995ce819915e734147a77850427a9e95f9', 'Cliente'),
(11, 'gisela ovalle', '1000931002', 'giselaovallle64@gmail.com', '3123511409', 'd8d8f1c9925e18286c1d8c74d946256ee8856f69', '2'),
(14, 'gisela', '12911823213', 'gisela@gmail.com', '2623784623', '7110eda4d09e062aa5e4a390b0a572ac0d2c0220', '2');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `auditoria`
--
ALTER TABLE `auditoria`
  ADD PRIMARY KEY (`idAuditoria`);

--
-- Indices de la tabla `bodega`
--
ALTER TABLE `bodega`
  ADD PRIMARY KEY (`idBodega`),
  ADD KEY `idProductoBodega` (`idProductoBodega`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idCliente`);

--
-- Indices de la tabla `compra`
--
ALTER TABLE `compra`
  ADD PRIMARY KEY (`idCompra`),
  ADD KEY `idClienteCompra` (`idClienteCompra`),
  ADD KEY `idProductoCompra` (`idProductoCompra`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`idEmpleado`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`idPedido`),
  ADD KEY `idProveedorPedido` (`idProveedorPedido`),
  ADD KEY `idProductoPedido` (`idProductoPedido`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idProducto`),
  ADD KEY `idTipo_Producto` (`idTipo_Producto`),
  ADD KEY `idProveedor_Producto` (`idProveedor_Producto`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`idProveedor`);

--
-- Indices de la tabla `rol`
--
ALTER TABLE `rol`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `tipo`
--
ALTER TABLE `tipo`
  ADD PRIMARY KEY (`idTipo`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`idUsuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `auditoria`
--
ALTER TABLE `auditoria`
  MODIFY `idAuditoria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=69;

--
-- AUTO_INCREMENT de la tabla `bodega`
--
ALTER TABLE `bodega`
  MODIFY `idBodega` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idCliente` smallint(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT de la tabla `compra`
--
ALTER TABLE `compra`
  MODIFY `idCompra` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `empleado`
--
ALTER TABLE `empleado`
  MODIFY `idEmpleado` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT de la tabla `pedido`
--
ALTER TABLE `pedido`
  MODIFY `idPedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `idProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `idProveedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `rol`
--
ALTER TABLE `rol`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `tipo`
--
ALTER TABLE `tipo`
  MODIFY `idTipo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `idUsuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `bodega`
--
ALTER TABLE `bodega`
  ADD CONSTRAINT `bodega_ibfk_1` FOREIGN KEY (`idProductoBodega`) REFERENCES `producto` (`idProducto`);

--
-- Filtros para la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `pedido_ibfk_1` FOREIGN KEY (`idProveedorPedido`) REFERENCES `proveedor` (`idProveedor`),
  ADD CONSTRAINT `pedido_ibfk_2` FOREIGN KEY (`idProductoPedido`) REFERENCES `producto` (`idProducto`);

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `idProveedor_Producto` FOREIGN KEY (`idProveedor_Producto`) REFERENCES `proveedor` (`idProveedor`),
  ADD CONSTRAINT `idTipo_Producto` FOREIGN KEY (`idTipo_Producto`) REFERENCES `tipo` (`idTipo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
