-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 10, 2019 at 03:42 PM
-- Server version: 10.1.29-MariaDB
-- PHP Version: 7.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `qpdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `questions`
--

CREATE TABLE `questions` (
  `ques_id` int(11) NOT NULL,
  `chp_no` int(11) NOT NULL,
  `sub_code` int(11) NOT NULL,
  `questions` varchar(255) NOT NULL,
  `marks` int(11) NOT NULL,
  `difficulty_lvl` int(11) NOT NULL,
  `probability` int(11) NOT NULL DEFAULT '0',
  `deleted` int(11) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `questions`
--

INSERT INTO `questions` (`ques_id`, `chp_no`, `sub_code`, `questions`, `marks`, `difficulty_lvl`, `probability`, `deleted`) VALUES
(1, 1, 17513, 'State any four attributes of good software.', 4, 5, 0, 0),
(2, 1, 17513, 'What do you mean by process framework?', 4, 5, 0, 0),
(3, 1, 17513, 'Define software process , software product , software work product and software engineering.', 8, 0, 0, 0),
(4, 1, 17513, 'Describe 4 levels of software engineering', 4, 0, 0, 0),
(5, 1, 17513, 'Explain spiral model with example.', 6, 5, 0, 0),
(6, 1, 17513, 'Describe RAD model.', 4, 10, 0, 0),
(7, 1, 17513, 'Explain incremental model', 4, 0, 0, 0),
(8, 1, 17513, 'What are PSP and TSP frame work activities? Explain.', 8, 10, 0, 0),
(9, 1, 17513, 'Compare PSP and TSP', 6, 0, 0, 0),
(10, 1, 17513, 'Explain different cycles in software development', 8, 10, 0, 0),
(11, 1, 17513, 'Describe Agile process model in detail.', 4, 0, 0, 0),
(12, 1, 17513, 'Explain the term scrum', 4, 0, 0, 0),
(13, 1, 17513, 'What is waterfall model, explain with advantages and disadvantages.', 8, 0, 0, 0),
(14, 1, 17513, 'What is meant by software deployment.', 4, 5, 0, 0),
(15, 1, 17513, 'Explain the features of Agile software development approach', 4, 5, 0, 0),
(16, 1, 17513, 'What is software? Explain embedded software.', 4, 10, 0, 0),
(17, 2, 17513, 'What are the core principles of software engineering? Explain', 8, 5, 0, 0),
(18, 2, 17513, 'What is SRS? ', 4, 10, 0, 0),
(19, 2, 17513, 'Explain general format of SRS.', 8, 10, 0, 0),
(20, 2, 17513, 'Explain deployment principles.', 4, 0, 0, 0),
(21, 2, 17513, 'Describe in detail eight principles of good planning.', 8, 5, 0, 0),
(22, 2, 17513, 'What are the core principles of software engineering.', 8, 0, 0, 0),
(23, 2, 17513, 'List the modelling principles in software engineering?', 4, 0, 0, 0),
(24, 2, 17513, 'What is requirement engineering ? What is its need?', 6, 5, 0, 0),
(25, 2, 17513, 'Explain Negotiation and Specification', 4, 0, 0, 0),
(26, 2, 17513, 'Explain Inception and Ellicitaiton', 4, 0, 0, 0),
(27, 2, 17513, 'Describe communication principles', 8, 0, 0, 0),
(28, 2, 17513, 'Describe communication principles.', 8, 0, 0, 0),
(29, 2, 17513, 'Explain any 8 communication principles', 8, 0, 0, 0),
(30, 2, 17513, 'Explain planning practices', 4, 5, 0, 0),
(31, 2, 17513, 'What are Analysis Modelling Principles.', 6, 5, 0, 0),
(32, 2, 17513, 'Explain Design Modelling Principles.', 4, 10, 0, 0),
(33, 2, 17513, 'Explain Construction Practices', 2, 0, 0, 0),
(34, 2, 17513, 'Explain Testing principles.', 4, 0, 0, 0),
(35, 2, 17513, 'List Requirement engineering principles.', 4, 5, 0, 0),
(36, 2, 17513, 'Explain Delivery cycle', 2, 0, 0, 0),
(37, 2, 17513, 'Explain support cycle', 2, 5, 0, 0),
(38, 2, 17513, 'Explain preparation principles.', 2, 5, 0, 0),
(39, 1, 17517, 'Explain the features of Java', 8, 5, 0, 0),
(40, 3, 17513, 'Explain DFD with example', 4, 5, 0, 0),
(41, 3, 17513, 'Explain the symbols of DFD.', 6, 5, 0, 0),
(42, 3, 17513, 'Draw level 0 and level 1 DFD', 6, 8, 0, 0),
(43, 3, 17513, 'Explain PSPEC.', 2, 5, 0, 0),
(44, 3, 17513, 'Explain Data Dictionary with an example', 6, 5, 0, 0),
(45, 3, 17513, 'Write four advantages and disadvantages of data dictonary', 4, 0, 0, 0),
(46, 3, 17513, 'Explain cardinality and modality', 4, 5, 0, 0),
(47, 3, 17513, 'Explain attributes', 2, 0, 0, 0),
(53, 3, 17513, 'Explain the difference between Cardinality and Modality', 6, 5, 0, 0),
(54, 1, 17513, 'Write four drawbacks of RAD', 4, 5, 0, 0),
(55, 3, 17513, 'List seven tasks of requirement engineering', 7, 10, 0, 0),
(56, 3, 17513, 'Explain following design concepts\r\n(i) Abstraction\r\n(ii) Pattern\r\n(iii) Refinement\r\n(iv) Refactoring', 6, 10, 0, 0),
(57, 3, 17513, 'What is need of debugging? List characteristics of bugs.', 3, 5, 0, 0),
(58, 3, 17513, 'Differentiate between PERT and CPM', 6, 0, 0, 0),
(59, 3, 17513, 'Explain McCall’s quality factor.', 4, 10, 0, 0),
(60, 1, 17513, 'List and explain types of system testing.', 4, 5, 0, 0),
(61, 1, 17513, 'Compare CMMI and ISO.', 4, 5, 0, 0),
(62, 3, 17513, 'Explain people and project factor in software management\r\nspectrum.', 4, 0, 0, 0),
(63, 2, 17513, 'Describe DMAIC and DMDAV approach of six sigma.', 8, 10, 0, 0),
(64, 2, 17513, 'Differentiate between prescriptive and agile process model', 4, 10, 0, 0),
(65, 3, 17513, 'What is need of SCM? List functions of SCM repository.', 2, 0, 0, 0),
(66, 1, 17513, 'Describe levels of CMMI technique.', 3, 5, 0, 0),
(67, 1, 17513, 'Explain integration testing with suitable example', 3, 0, 0, 0),
(68, 1, 17513, 'What is software risk? Describe working of RMMM plan.', 3, 10, 0, 0),
(69, 2, 17513, 'Draw use case diagram of library system.', 3, 0, 0, 0),
(70, 2, 17513, 'Describe ways of tracking project schedule.', 3, 5, 0, 0),
(71, 2, 17513, 'Define SQA. List SQA activities.', 3, 10, 0, 0),
(72, 3, 17513, 'Explain any four software categories.', 3, 0, 0, 0),
(73, 3, 17513, 'Explain changing nature of software.', 3, 5, 0, 0),
(74, 3, 17513, 'What is alpha-beta testing?', 3, 10, 0, 0),
(75, 1, 17513, 'What do you mean by good test?', 4, 10, 0, 0),
(76, 2, 17513, 'What is an object oriented analysis?', 5, 10, 0, 0),
(77, 2, 17513, 'What is test plan?', 3, 10, 0, 0),
(78, 3, 17513, 'Describe regression testing.', 4, 10, 0, 0),
(79, 3, 17513, 'What is SPM? Why is it needed?', 6, 10, 0, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `questions`
--
ALTER TABLE `questions`
  ADD PRIMARY KEY (`ques_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `questions`
--
ALTER TABLE `questions`
  MODIFY `ques_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=80;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
