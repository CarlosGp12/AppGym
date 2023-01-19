-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 19-01-2023 a las 03:06:39
-- Versión del servidor: 5.7.36
-- Versión de PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `dbgym`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historial`
--

DROP TABLE IF EXISTS `historial`;
CREATE TABLE IF NOT EXISTS `historial` (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(25) NOT NULL,
  `peso` float NOT NULL,
  `factor_crecimiento` float NOT NULL,
  `fecha` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(25) NOT NULL,
  `password` varchar(500) NOT NULL,
  `celular` varchar(12) NOT NULL,
  `rol` int(2) DEFAULT '2',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id`, `username`, `password`, `celular`, `rol`) VALUES
(1, 'stevenp', '$2b$10$oLlonRMQJfVpnKe7snuLOet0Nz57sq187ET3ugbNEtJxxOtA4u89O', '986133024', 2),
(2, 'e', '$2b$10$Utc4lIJxqDXlkgnlRfIyjuNLAs9oeOfVHi7oFekmd1MNrdMMGh2k2', '987654321', 2),
(3, 'eee', '$2b$10$gZ0X22P5g//7wYZtTR8c4u/8eFSosrMo3G5pRT6NqGiyMYyvTOu6i', '99997785', 2),
(4, 'ad', '$2b$10$veOU4SgoWYuPQCFkmmtf8eaFbYFCKjMCZteUM0eIKZGBQEtjvuAzK', '912345678', 2),
(5, 'z', '$2b$10$VMs1SoKH/DaSc5qjxlfiFOPTWo.FqQtz.JOUDLtjFTH5Ndxch0zny', '944871540', 2),
(6, 'admin', '$2b$10$U5V8GHWjnEa1pGaL2Tk5/ehL3yCIFD6E0cF844SOTF6GF2VI26B7u', '952145632', 1),
(7, 'motobene', '$2b$10$l/AUnYmfHmPjwSqWYYcng.V2s4mfMb1Fz7akfrimLyKZT2nCBQVbq', '98885210', 2),
(8, 'teee', '$2b$10$E/D39/eQJNdNe3fSVSazv.A3ZWD7HnkcZtf.45srrMCSFNU712nhK', '2', 2);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
