-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: db
-- Generation Time: Nov 7, 2023 at 04:49 AM
-- Server version: 5.7.41
-- PHP Version: 8.1.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `manager`
--

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
                           `id` varchar(10) NOT NULL,
                           `name` varchar(50) NOT NULL,
                           `age` int(10) NOT NULL,
                           `email` varchar(50) NOT NULL,
                           `ielts_score` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`id`, `name`, `age`, `email`, `ielts_score`) VALUES
                                                                        (1, 'Qui', 20, 'thanhqui@gmail.com', 7.5),
                                                                        (2, 'Ana', 21, 'ana@gmail.com', 5.0),
                                                                        (3, 'Jan', 19, 'jan@gmail.com', 6.5),
                                                                        (4, 'Lux', 28, 'lux@gmail.com', 8.5),
                                                                        (5, 'Wen', 32, 'wen@gmail.com', 6.0),
                                                                        (6, 'Kai', 24, 'kai@gmail.com', 7.0),
                                                                        (7, 'Han', 18, 'han@gmail.com', 9.0),
                                                                        (8, 'Bob', 26, 'bob@gmail.com', 7.0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `student`
--
ALTER TABLE `student`
    ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
    MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

