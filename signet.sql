-- phpMyAdmin SQL Dump
-- version 4.8.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 01, 2019 at 07:42 PM
-- Server version: 10.1.31-MariaDB
-- PHP Version: 7.1.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `signet`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `customer_id` int(11) NOT NULL,
  `customer_name` varchar(255) NOT NULL,
  `customer_address` varchar(255) NOT NULL,
  `customer_phno` varchar(255) NOT NULL,
  `customer_email` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`customer_id`, `customer_name`, `customer_address`, `customer_phno`, `customer_email`) VALUES
(1, 'Nikhil Ghind', 'UNR', '9819098190', 'nikhil@gmail.com'),
(2, 'Jash Doshi', 'VP Road,\r\nMulund (W).', '9820098200', 'jash@gmail.com'),
(6, 'Ashay Gogri', 'Mulund', '9930993012', 'ashay@gmail.com'),
(8, 'Yash Mehta', 'Opposite Railway Station\r\nGhatkopar (E)', '9876598765', 'yashmehta@gmail.com'),
(9, 'Shweta Solanki', 'Mulund (W)', '9823498234', 'shweta@gmail.com'),
(10, 'Hiral Visaria', 'Ghatkopar (W)', '9800098000', 'hiral@gmail.com'),
(11, 'Shraddha Keniya', 'Mulund (E)', '9819098191', 'shraddha@gmail.com'),
(12, 'Kinjal Parikh', 'Vikhroli', '9811198111', 'kinjal@gmail.com'),
(13, 'Jinesh Doshi', 'Ghatkopar', '9812298122', 'jinesh@gmail.com'),
(14, 'Raj Panchal', 'kisan nagar 3 thane', '9090908776', 'raj@gmail.com'),
(15, 'Yash Thakkar', 'vp road mulund', '9876987654', 'yash1200@gmail.com'),
(16, 'rohit sharma', 'ulhasnagar', '9087678009', 'rohits@gmail.com'),
(17, 'niraj bhatija', 'navi mumbai', '9876790689', 'niraj@gmail.com'),
(18, 'mohit parekhr', 'chembur', '9090987889', 'mohit@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `customer_member`
--

CREATE TABLE `customer_member` (
  `id` int(11) NOT NULL,
  `member_id` int(11) NOT NULL,
  `customer_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer_member`
--

INSERT INTO `customer_member` (`id`, `member_id`, `customer_id`) VALUES
(1, 2, 8),
(2, 3, 2),
(3, 4, 6);

-- --------------------------------------------------------

--
-- Table structure for table `customer_site`
--

CREATE TABLE `customer_site` (
  `customer_site_id` int(11) NOT NULL,
  `customer_id` int(11) NOT NULL,
  `customer_site_name` varchar(255) NOT NULL,
  `site_address` varchar(255) NOT NULL,
  `length` int(5) NOT NULL,
  `width` int(5) NOT NULL,
  `height` int(5) NOT NULL,
  `floor_plan` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer_site`
--

INSERT INTO `customer_site` (`customer_site_id`, `customer_id`, `customer_site_name`, `site_address`, `length`, `width`, `height`, `floor_plan`) VALUES
(3, 2, 'Ashay Farm House', 'Mulund (W)', 15, 12, 10, 'jpg'),
(4, 1, 'Nikhil farm house', 'ulhasnagar', 12, 23, 43, 'jpg'),
(5, 6, 'harsha apartments', 'mulund west', 45, 21, 33, 'jpg'),
(6, 8, 'neelkanth', 'chembur east', 12, 32, 43, 'jpg'),
(7, 9, 'neeta apartments', 'ghatkopar', 45, 22, 66, 'jpg'),
(8, 10, 'vardhman nagar', 'govandi', 12, 45, 49, 'jpg'),
(9, 11, 'veena nagar', 'tilak nagar', 45, 66, 33, 'jpg'),
(10, 12, 'manisha heights', 'chembur', 78, 451, 21, 'jpg'),
(11, 13, 'afga', 'vashi', 45, 12, 33, 'jpg'),
(12, 14, 'chetan apartments', 'thane', 12, 13, 66, 'jpg'),
(13, 15, 'kalidas', 'bhandup', 66, 33, 77, 'jpg'),
(14, 16, 'wankhede', 'bombay', 66, 33, 99, 'jpg'),
(15, 17, 'galaxy apartments', 'vani vidyala', 44, 51, 12, 'jpg'),
(16, 14, 'ashar', 'thane east', 44, 21, 33, 'jpg'),
(17, 18, 'kochin', 'palghar', 63, 56, 96, 'jpg'),
(18, 6, 'tridev', 'mumbai', 59, 65, 64, 'jpg');

-- --------------------------------------------------------

--
-- Table structure for table `design`
--

CREATE TABLE `design` (
  `design_id` int(11) NOT NULL,
  `design` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `design`
--

INSERT INTO `design` (`design_id`, `design`) VALUES
(1, 'Tulips.jpg'),
(2, 'Jellyfish.jpg'),
(3, 'Hydrangeas.jpg'),
(4, 'Desert.jpg'),
(5, 'Lighthouse.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `enquiry`
--

CREATE TABLE `enquiry` (
  `enquiry_id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `phone_number` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `budget` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `members`
--

CREATE TABLE `members` (
  `member_id` int(11) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `first_login` int(11) NOT NULL,
  `role` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `members`
--

INSERT INTO `members` (`member_id`, `email`, `password`, `first_login`, `role`) VALUES
(1, 'signet@gmail.com', 'signet123', 2, 'admin'),
(2, 'yash@gmail.com', 'abc123', 1, 'customer'),
(3, 'jash@gmail.com', 'abc123', 1, 'customer'),
(4, 'ashay@gmail.com', 'abc123', 1, 'customer');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `product_id` int(11) NOT NULL,
  `product_name` varchar(255) NOT NULL,
  `product_quantity` int(11) NOT NULL,
  `product_selling_price` varchar(255) NOT NULL,
  `product_additional_description` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`product_id`, `product_name`, `product_quantity`, `product_selling_price`, `product_additional_description`) VALUES
(1, 'Simple Tiles', 250, '1500', 'Plain Simple Tiles'),
(2, 'Sliders', 500, '5000', 'Smooth Sliders for Drawers'),
(3, 'Kitchen Rack', 100, '600', 'Stainless steel 3 drawer kitchen rack'),
(5, 'Kitchen Cabinet', 40, '1000', 'Silver colour strong cabinet '),
(6, 'Vertical Storage Unit', 60, '2000', 'Tall unit as the name suggests, 1900 mm'),
(7, 'Rolling Shutters', 30, '777', 'Made from aluminum plastic'),
(8, 'Corner Solution', 15, '115', 'It is easyily accessible because of its user friendly moves'),
(9, 'Pull Down Basket', 5, '355', 'We offer swing trays, smooth to use'),
(10, 'Skirting Elbow', 10, '400', 'Skirting Elbow is made of aluminium and plastic which is used in kitchen'),
(11, 'Aluminium Door', 20, '880', 'Strong aluminium door for drawers'),
(12, 'Plate Holder', 40, '200', 'Holder for dishes '),
(13, 'Breakfast Table', 40, '450', 'Small table for breakfast made up of glass'),
(14, 'Microwave Frame', 10, '710', 'Frame to protect your microwave door ');

-- --------------------------------------------------------

--
-- Table structure for table `purchase`
--

CREATE TABLE `purchase` (
  `purchase_id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `purchase_quantity` int(11) NOT NULL,
  `purchase_rate` double NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `purchase`
--

INSERT INTO `purchase` (`purchase_id`, `product_id`, `purchase_quantity`, `purchase_rate`, `date`) VALUES
(1, 1, 150, 650, '2019-02-28');

-- --------------------------------------------------------

--
-- Table structure for table `quotation`
--

CREATE TABLE `quotation` (
  `quotation_id` int(11) NOT NULL,
  `customer_site_id` int(11) NOT NULL,
  `design_charges` double NOT NULL,
  `labor_charges` int(11) NOT NULL,
  `status` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `quotation`
--

INSERT INTO `quotation` (`quotation_id`, `customer_site_id`, `design_charges`, `labor_charges`, `status`) VALUES
(13, 6, 25000, 10000, 2),
(14, 3, 25000, 10000, 1),
(15, 18, 10000, 23000, 2);

-- --------------------------------------------------------

--
-- Table structure for table `quotation_design`
--

CREATE TABLE `quotation_design` (
  `id` int(11) NOT NULL,
  `quotation_id` int(11) NOT NULL,
  `design_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `quotation_design`
--

INSERT INTO `quotation_design` (`id`, `quotation_id`, `design_id`) VALUES
(1, 13, 1),
(2, 13, 2),
(3, 15, 3),
(4, 15, 4),
(5, 15, 5);

-- --------------------------------------------------------

--
-- Table structure for table `quotation_product`
--

CREATE TABLE `quotation_product` (
  `id` int(11) NOT NULL,
  `quotation_id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `quantity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `quotation_product`
--

INSERT INTO `quotation_product` (`id`, `quotation_id`, `product_id`, `quantity`) VALUES
(3, 13, 10, 10),
(4, 13, 2, 2),
(5, 14, 8, 10),
(6, 14, 5, 12),
(7, 14, 14, 5),
(8, 15, 10, 5),
(9, 15, 8, 10),
(10, 15, 6, 20);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`customer_id`);

--
-- Indexes for table `customer_member`
--
ALTER TABLE `customer_member`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `customer_site`
--
ALTER TABLE `customer_site`
  ADD PRIMARY KEY (`customer_site_id`);

--
-- Indexes for table `design`
--
ALTER TABLE `design`
  ADD PRIMARY KEY (`design_id`);

--
-- Indexes for table `enquiry`
--
ALTER TABLE `enquiry`
  ADD PRIMARY KEY (`enquiry_id`);

--
-- Indexes for table `members`
--
ALTER TABLE `members`
  ADD PRIMARY KEY (`member_id`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`product_id`);

--
-- Indexes for table `purchase`
--
ALTER TABLE `purchase`
  ADD PRIMARY KEY (`purchase_id`);

--
-- Indexes for table `quotation`
--
ALTER TABLE `quotation`
  ADD PRIMARY KEY (`quotation_id`);

--
-- Indexes for table `quotation_design`
--
ALTER TABLE `quotation_design`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `quotation_product`
--
ALTER TABLE `quotation_product`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `customer_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `customer_member`
--
ALTER TABLE `customer_member`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `customer_site`
--
ALTER TABLE `customer_site`
  MODIFY `customer_site_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `design`
--
ALTER TABLE `design`
  MODIFY `design_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `enquiry`
--
ALTER TABLE `enquiry`
  MODIFY `enquiry_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `members`
--
ALTER TABLE `members`
  MODIFY `member_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `product_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `purchase`
--
ALTER TABLE `purchase`
  MODIFY `purchase_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `quotation`
--
ALTER TABLE `quotation`
  MODIFY `quotation_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `quotation_design`
--
ALTER TABLE `quotation_design`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `quotation_product`
--
ALTER TABLE `quotation_product`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
