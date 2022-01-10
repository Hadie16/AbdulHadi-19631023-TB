-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jan 09, 2022 at 02:29 PM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 8.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbKRS`
--

-- --------------------------------------------------------

--
-- Table structure for table `akunlogin`
--

CREATE TABLE `akunlogin` (
  `npm` varchar(11) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `akunlogin`
--

INSERT INTO `akunlogin` (`npm`, `username`, `password`) VALUES
('19631010', 'Gerome Sertgen', 'gerome123'),
('19631023', 'Abdul Hadi', 'hadi123');

-- --------------------------------------------------------

--
-- Table structure for table `ambilkrs`
--

CREATE TABLE `ambilkrs` (
  `kode_krs` varchar(300) NOT NULL,
  `npm` varchar(11) NOT NULL,
  `kode` varchar(20) NOT NULL,
  `nama_makul` varchar(50) NOT NULL,
  `sks` int(5) NOT NULL,
  `Kelas` varchar(30) NOT NULL,
  `ambil` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ambilkrs`
--

INSERT INTO `ambilkrs` (`kode_krs`, `npm`, `kode`, `nama_makul`, `sks`, `Kelas`, `ambil`) VALUES
('KRS20220109191102', '19631010', 'TIF3501', 'STATISTIK DAN PROBABILITAS', 2, '5A reg Pagi Banjarbaru', 'DITERIMA'),
('KRS20220109191108', '19631010', 'TIF3503', 'TEKNOLOGI MULTIMEDIA', 2, '5A reg Pagi Banjarbaru', 'DITERIMA'),
('KRS20220109191115', '19631010', 'TIF3506', 'PEMROGRAMAN VISUAL 3', 3, '5A reg Pagi Banjarbaru', 'DITERIMA'),
('KRS20220109210810', '19631023', 'TIF3501', 'STATISTIK DAN PROBABILITAS', 2, '5M reg Pagi Banjarbaru', 'DITERIMA');

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `npm` varchar(11) NOT NULL,
  `nama_mhs` varchar(50) NOT NULL,
  `tempat_lahir` varchar(50) NOT NULL,
  `tgl_lahir` date NOT NULL,
  `jenis_kelamin` varchar(20) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `no_telp` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`npm`, `nama_mhs`, `tempat_lahir`, `tgl_lahir`, `jenis_kelamin`, `alamat`, `no_telp`) VALUES
('19630000', 'PARHELIM Junior senor', 'malang', '2022-01-05', 'Perempuan', 'Milan', '085250000444'),
('19631010', 'Gerome Sertgen', 'mississipi', '2022-01-06', 'Laki-Laki', 'mississipi', '084734'),
('19631023', 'Abdul Hadi', 'Tanjung', '1999-03-16', 'Laki-Laki', 'Martapura', '085250189722');

-- --------------------------------------------------------

--
-- Table structure for table `matakuliah`
--

CREATE TABLE `matakuliah` (
  `kode` varchar(20) NOT NULL,
  `nama_makul` varchar(50) NOT NULL,
  `sks` int(5) NOT NULL,
  `nama_dosen` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `matakuliah`
--

INSERT INTO `matakuliah` (`kode`, `nama_makul`, `sks`, `nama_dosen`) VALUES
('TIF3501', 'statistik dan probabilitas', 2, 'AMALIA WAHYUNI, S.E., M.M'),
('TIF3502', 'INTERAKSI MANUSIA DAN KOMPUTER', 2, 'FAKHRIANI EKAWATI'),
('TIF3503', 'TEKNOLOGI MULTIMEDIA', 2, 'REZKY IZZATUL YAZIDAH ANWAR, S.Kom., M.Kom'),
('TIF3504', 'KECERDASAN BUATAN', 3, 'MAYANG SARI, S.Kom., M.Kom'),
('TIF3505', 'E-COMMERCE', 2, 'BUDI RAMADHANI'),
('TIF3506', 'PEMROGRAMAN VISUAL 3', 3, 'MUHAMMAD SAIDI RAHMAN, M.Kom'),
('TIF3507', 'TEKNIK KOMPILASI', 2, 'AL FATH RIZA KHOLDANI, S.Kom., M.Kom'),
('TIF3508', 'PEMROGRAMAN BERBASIS OBJEK 2', 3, 'MUHAMMAD EDYA ROSADI, S.Kom., M.Kom'),
('TIF3509', 'REKAYASA PERANGKAT LUNAK', 2, 'HAYATI NOOR'),
('TIF3510', 'ANALISIS DAN DESAIN SISTEM INFORMASI', 2, 'RUSDINA, S.Kom., M.Kom');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `akunlogin`
--
ALTER TABLE `akunlogin`
  ADD PRIMARY KEY (`npm`),
  ADD KEY `npm` (`npm`);

--
-- Indexes for table `ambilkrs`
--
ALTER TABLE `ambilkrs`
  ADD PRIMARY KEY (`kode_krs`),
  ADD KEY `kode_krs` (`kode_krs`),
  ADD KEY `kode_krs_2` (`kode_krs`),
  ADD KEY `kode` (`kode`),
  ADD KEY `npm` (`npm`);

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`npm`);

--
-- Indexes for table `matakuliah`
--
ALTER TABLE `matakuliah`
  ADD PRIMARY KEY (`kode`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `akunlogin`
--
ALTER TABLE `akunlogin`
  ADD CONSTRAINT `akunlogin_ibfk_1` FOREIGN KEY (`npm`) REFERENCES `mahasiswa` (`npm`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `ambilkrs`
--
ALTER TABLE `ambilkrs`
  ADD CONSTRAINT `ambilkrs_ibfk_3` FOREIGN KEY (`kode`) REFERENCES `matakuliah` (`kode`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ambilkrs_ibfk_4` FOREIGN KEY (`npm`) REFERENCES `mahasiswa` (`npm`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
