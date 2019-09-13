-- phpMyAdmin SQL Dump
-- version 4.4.15.9
-- https://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Apr 19, 2019 at 02:16 AM
-- Server version: 5.6.37
-- PHP Version: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `food_delivery_project`
--

-- --------------------------------------------------------

--
-- Table structure for table `address`
--

CREATE TABLE IF NOT EXISTS `address` (
  `address_id` int(11) NOT NULL,
  `address` varchar(100) NOT NULL,
  `zip_code` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=265 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `address`
--

INSERT INTO `address` (`address_id`, `address`, `zip_code`) VALUES
(1, '367-9189 Rutrum Road', 50618),
(2, '515-7554 Nonummy. Rd.', 35769),
(3, '533-3258 Vehicula Road', 63034),
(4, 'Ap #425-516 Diam. Road', 68076),
(5, '1658 Ut Rd.', 30457),
(6, 'P.O. Box 165, 686 Vivamus Rd.', 12479),
(7, '349-6519 Nunc. Av.', 25954),
(8, 'P.O. Box 301, 2046 Eu Ave', 59525),
(9, '673-1871 Sed Rd.', 29719),
(10, '2828 Mauris St.', 68205),
(11, '560 Eu Road', 41677),
(12, '162-7830 Egestas Street', 20288),
(13, '486-8675 Dui. St.', 46212),
(14, '397-7702 Non St.', 68849),
(15, 'P.O. Box 821, 843 Dolor. Avenue', 91852),
(16, 'Ap #882-3585 Interdum Ave', 75194),
(17, '1213 Sodales Street', 96470),
(18, 'Ap #401-2273 Tempus, St.', 45046),
(19, '156-2003 Nunc Ave', 26982),
(20, 'Ap #880-6179 Non, St.', 32443),
(21, '330-6060 Enim. St.', 27771),
(22, 'Ap #838-7253 In Street', 91644),
(23, '7924 Blandit Road', 42945),
(24, '156-3612 Nec, Street', 98193),
(25, 'P.O. Box 134, 1148 Neque. Avenue', 86361),
(26, '2244 Sed Street', 77072),
(27, 'Ap #469-8135 Sit Road', 78796),
(28, 'Ap #175-3406 Aliquet St.', 31646),
(29, '2989 Accumsan Ave', 18427),
(30, 'P.O. Box 403, 784 Phasellus Road', 19097),
(31, 'P.O. Box 730, 5188 Mauris, Street', 46059),
(32, 'P.O. Box 271, 8216 Amet Street', 55105),
(33, 'Ap #888-2384 Et, Rd.', 43683),
(34, 'Ap #363-3036 Lorem St.', 37660),
(35, '6365 Ornare. Ave', 65197),
(36, '474-3393 Lacus Rd.', 50052),
(37, 'P.O. Box 983, 4312 Velit Avenue', 62884),
(38, '387-7794 Amet Rd.', 99595),
(39, 'P.O. Box 855, 8438 Sed Ave', 77222),
(40, '7352 Netus Rd.', 78064),
(41, 'Ap #169-3347 Ac, St.', 65561),
(42, 'Ap #634-9715 Aliquam Street', 95951),
(43, '602-4247 Neque. Rd.', 10112),
(44, 'Ap #254-4145 Ante Street', 80494),
(45, 'Ap #996-9767 Varius Road', 15233),
(46, '757-1188 Dictum Av.', 73050),
(47, '9159 Nunc St.', 22603),
(48, '766-2822 Vulputate, Street', 98921),
(49, '779-9663 Luctus Av.', 11892),
(50, 'Ap #488-6788 Felis. Avenue', 71122),
(51, 'Ap #651-6055 Sociis Rd.', 68539),
(52, 'P.O. Box 670, 1167 Natoque Road', 38599),
(53, 'Ap #549-3835 Eros St.', 96485),
(54, '873-8696 Vulputate, Av.', 96643),
(55, 'P.O. Box 313, 364 Et St.', 98497),
(56, '5592 Et, St.', 66731),
(57, '7831 Curae; Street', 34152),
(58, 'P.O. Box 115, 8758 Litora Road', 78052),
(59, '974-4756 Est Ave', 13086),
(60, 'Ap #767-6266 Eu Ave', 22725),
(61, 'Ap #815-1096 Diam Rd.', 60743),
(62, 'P.O. Box 801, 2453 Nullam Avenue', 52507),
(63, '3235 At Rd.', 97908),
(64, '9646 Phasellus Street', 55654),
(65, '1614 Odio. Av.', 81139),
(66, 'P.O. Box 800, 7019 Erat Ave', 69608),
(67, '322-1719 Cum Ave', 52246),
(68, 'P.O. Box 500, 7178 Dolor. Street', 27558),
(69, '8595 Lacinia. St.', 96238),
(70, '7540 Elit Street', 57710),
(71, '461-2761 Hymenaeos. Rd.', 71758),
(72, 'P.O. Box 728, 9617 Luctus St.', 33293),
(73, 'Ap #519-4752 Cras Ave', 56943),
(74, '670-9987 Est. Ave', 50702),
(75, 'Ap #288-9458 Nonummy Av.', 99723),
(76, 'P.O. Box 737, 5077 Ac St.', 92478),
(77, '5772 Vel, St.', 34867),
(78, '9206 Auctor, Rd.', 66699),
(79, 'Ap #998-6971 Porttitor Ave', 25574),
(80, 'P.O. Box 870, 3718 Eget St.', 45000),
(81, 'P.O. Box 898, 7015 Duis Rd.', 17027),
(82, 'Ap #412-4338 Molestie St.', 34624),
(83, 'P.O. Box 656, 9398 Quisque Rd.', 67207),
(84, '315-4784 Lacinia Avenue', 48724),
(85, '5668 Amet, St.', 24992),
(86, '7094 Lectus, Rd.', 55511),
(87, 'P.O. Box 105, 2393 Aenean St.', 31078),
(88, '798-4691 Et, St.', 50622),
(89, '583-3970 In St.', 72395),
(90, '926-2456 Erat. Street', 66652),
(91, '708-1547 Eros. Av.', 91800),
(92, '6161 Pretium Street', 92708),
(93, '3655 Sapien, St.', 17466),
(94, '5467 Urna. Av.', 75600),
(95, 'Ap #108-3615 Vitae, Rd.', 55471),
(96, '1626 Vulputate, Road', 85982),
(97, 'Ap #288-9106 Et Road', 91607),
(98, '4309 Quisque Rd.', 57188),
(99, 'P.O. Box 632, 8017 A, Rd.', 91490),
(100, '6316 Lobortis Street', 74816),
(101, 'Ap #228-2542 Non Rd.', 15260),
(102, '2614 Sed Avenue', 80068),
(103, 'P.O. Box 199, 8414 Ante Avenue', 46617),
(104, '119-1656 Quisque Av.', 13571),
(105, 'Ap #971-3080 Fringilla. Rd.', 27115),
(106, '6641 Praesent Avenue', 67222),
(107, 'P.O. Box 708, 1654 Sodales St.', 26199),
(108, '8648 Amet St.', 58316),
(109, '2317 Sed Rd.', 55150),
(110, '2362 Orci, Rd.', 43667),
(111, 'Ap #978-3089 Eu Rd.', 21300),
(112, 'Ap #201-1578 Fermentum Street', 93491),
(113, 'P.O. Box 280, 9913 Phasellus St.', 49581),
(114, '971-3946 Fusce Street', 13853),
(115, '533-6456 Et, St.', 21099),
(116, 'Ap #832-4438 Et, Avenue', 13653),
(117, '7328 Semper Avenue', 40990),
(118, 'P.O. Box 794, 437 Natoque Street', 48143),
(119, 'P.O. Box 847, 9241 Rutrum St.', 42234),
(120, 'Ap #957-3196 Libero Road', 95320),
(121, 'P.O. Box 685, 917 Eu, Rd.', 43416),
(122, 'P.O. Box 680, 7871 Sed Av.', 88390),
(123, 'Ap #145-9466 Donec Avenue', 85340),
(124, '786-1773 Fringilla Ave', 71603),
(125, 'Ap #881-536 Amet Rd.', 18868),
(126, 'Ap #484-3328 Montes, Ave', 10334),
(127, '553-2405 Et Rd.', 35970),
(128, 'P.O. Box 509, 546 Dictum. Road', 50212),
(129, 'P.O. Box 636, 1097 Vitae Road', 55877),
(130, 'Ap #632-2720 Facilisis, Av.', 53749),
(131, 'P.O. Box 698, 4438 Et Ave', 77950),
(132, 'P.O. Box 207, 2725 Nulla. Ave', 35811),
(133, 'P.O. Box 985, 6465 Velit Street', 12462),
(134, 'Ap #935-3230 Nibh Av.', 57184),
(135, 'P.O. Box 866, 7598 Ultricies Road', 41741),
(136, 'P.O. Box 106, 8619 Id, Rd.', 43800),
(137, 'Ap #633-5906 Adipiscing Rd.', 50900),
(138, '537 Erat Street', 49891),
(139, 'P.O. Box 838, 474 Semper Rd.', 62603),
(140, '396-4842 Rutrum St.', 47306),
(141, 'P.O. Box 203, 754 Cursus Av.', 28342),
(142, 'Ap #997-4313 Fringilla St.', 31268),
(143, 'P.O. Box 466, 1189 Ipsum Road', 89261),
(144, 'P.O. Box 686, 1577 Maecenas Street', 45145),
(145, 'P.O. Box 512, 4373 Mauris Rd.', 76022),
(146, 'P.O. Box 289, 2413 Quam. Av.', 64828),
(147, '4793 Bibendum. St.', 59809),
(148, 'P.O. Box 645, 4253 Nec St.', 94840),
(149, 'P.O. Box 641, 9383 Phasellus St.', 25521),
(150, '272-1761 Nunc Rd.', 83539),
(151, '407-6185 Nec, Rd.', 34489),
(152, 'Ap #713-6675 Etiam Road', 61755),
(153, '721-3597 Hendrerit. St.', 42549),
(154, '320-4951 Bibendum. Av.', 86760),
(155, 'P.O. Box 867, 4421 Purus, Av.', 70345),
(156, 'Ap #871-8218 Dolor, Road', 28893),
(157, 'Ap #683-319 Risus. Av.', 57113),
(158, 'P.O. Box 647, 4172 Semper Rd.', 72322),
(159, '929-8299 Nisi. St.', 41142),
(160, 'P.O. Box 570, 7568 Ultrices Rd.', 80445),
(161, 'Ap #646-2684 Lacinia Road', 33412),
(162, '187-3413 Aenean Ave', 17347),
(163, 'P.O. Box 123, 5584 Massa. Ave', 32177),
(164, '6620 Cubilia Avenue', 28645),
(165, '3692 Proin St.', 64778),
(166, 'P.O. Box 330, 8345 Orci Av.', 83587),
(167, 'P.O. Box 678, 6837 Vulputate, Rd.', 55672),
(168, '4192 Euismod St.', 44436),
(169, '345-4139 Velit St.', 52393),
(170, 'P.O. Box 600, 8596 In Rd.', 23448),
(171, 'P.O. Box 385, 923 Mollis St.', 20936),
(172, 'Ap #120-3635 Ligula Road', 76487),
(173, 'Ap #162-2849 Malesuada Street', 11703),
(174, '4731 Odio. Av.', 28562),
(175, 'P.O. Box 119, 152 Pede, Street', 40373),
(176, 'P.O. Box 189, 4835 Neque Road', 26671),
(177, '9521 Ipsum. Avenue', 96579),
(178, 'P.O. Box 431, 1253 Curae; St.', 33257),
(179, 'Ap #816-8126 Ultricies Road', 50279),
(180, 'Ap #213-5215 Accumsan Avenue', 51082),
(181, 'Ap #220-5167 Egestas Street', 41002),
(182, '8095 Suscipit Road', 61818),
(183, 'Ap #790-9944 Proin Avenue', 60231),
(184, '3270 Donec St.', 63172),
(185, 'Ap #782-194 Odio St.', 78851),
(186, '4041 Ante Av.', 80364),
(187, '890-4990 At, Avenue', 53477),
(188, '2448 Odio. St.', 34619),
(189, 'P.O. Box 594, 9370 Nec Ave', 64389),
(190, '387-9172 Odio Road', 48819),
(191, '146-6478 Iaculis Rd.', 31545),
(192, 'P.O. Box 987, 6824 Lacus. Ave', 12070),
(193, '986-4637 Vel, St.', 82839),
(194, 'Ap #546-9703 Egestas. St.', 30194),
(195, '235-9917 Donec Ave', 68991),
(196, 'P.O. Box 579, 3811 Enim. St.', 50165),
(197, 'P.O. Box 777, 8359 Blandit Ave', 25502),
(198, 'Ap #758-9007 Non Av.', 22452),
(199, '1056 Nonummy Ave', 52711),
(200, 'Ap #696-7960 Lorem. Street', 35555),
(201, '7811 Quam. St.', 45440),
(202, 'Ap #640-169 Nonummy Ave', 60870),
(203, 'Ap #923-8275 Et St.', 18809),
(204, 'Ap #767-1291 Dapibus Avenue', 20463),
(205, '6457 Quis, Road', 85329),
(206, 'Ap #769-9525 Cursus. St.', 75539),
(207, '292-1548 Non Rd.', 16953),
(208, '3652 A Ave', 19516),
(209, '669-7650 Fermentum St.', 54052),
(210, 'P.O. Box 467, 8616 Mi, Rd.', 23204),
(211, 'P.O. Box 932, 1093 Luctus Rd.', 41000),
(212, '8113 Non, St.', 34117),
(213, 'Ap #142-6032 Placerat. Rd.', 68123),
(214, '253-8076 Praesent St.', 56106),
(215, 'Ap #872-5221 Neque. Avenue', 62836),
(216, 'Ap #490-5923 Congue. Road', 12947),
(217, '433-3988 Curabitur Street', 58190),
(218, '2186 Risus Rd.', 86810),
(219, 'P.O. Box 763, 3152 Facilisis Av.', 86167),
(220, 'P.O. Box 846, 5095 Magna St.', 68838),
(221, '516-8230 Et Rd.', 34311),
(222, 'P.O. Box 975, 6574 Lacinia Ave', 21285),
(223, '5231 Duis Road', 68398),
(224, 'Ap #395-5402 Aenean St.', 35169),
(225, 'P.O. Box 229, 8827 Est Av.', 35316),
(226, 'P.O. Box 302, 9255 Mauris Road', 11755),
(227, '4993 Velit. Street', 75668),
(228, 'P.O. Box 796, 3146 Odio. Av.', 94818),
(229, 'P.O. Box 153, 3965 Erat Street', 64792),
(230, '2173 Tellus Rd.', 68370),
(231, 'Ap #760-7624 Velit. Rd.', 10465),
(232, 'Ap #773-5514 Scelerisque Road', 90639),
(233, '157-6158 Suscipit, Street', 69115),
(234, '349-4873 Odio Av.', 87752),
(235, 'P.O. Box 866, 4191 Odio. Street', 43830),
(236, 'Ap #491-6849 Convallis Ave', 59485),
(237, 'Ap #551-5717 Duis Rd.', 56463),
(238, '3870 Scelerisque, Road', 69562),
(239, 'Ap #212-8333 Tellus Road', 76444),
(240, '7843 Magna, St.', 30518),
(241, '4161 Vel, Rd.', 68553),
(242, '970-3042 Tellus. Road', 16063),
(243, 'Ap #482-411 Ut St.', 15545),
(244, 'Ap #646-8862 Molestie Street', 34741),
(245, 'Ap #633-995 Id, Ave', 68927),
(246, 'P.O. Box 392, 6767 Duis Street', 83554),
(247, '9284 Faucibus Avenue', 59289),
(248, '628-3150 Lorem. Avenue', 96123),
(249, '730-2838 Metus. Avenue', 36637),
(250, '147-4937 Sed Rd.', 45325),
(251, '6345 Marchand Street # 1', 15206),
(252, 'Shadyside', 15206),
(253, '6345 Marchand Street # 1,', 15206),
(254, '6345 Marchand Street # 2', 15206),
(255, '6345 Marchand Street # 2', 15206),
(256, '6345 Marchand Street # 2', 15206),
(257, '6345 Marchand Street # 2', 15206),
(258, '6345 Marchand Street # 2', 15206),
(259, '6345 Marchand Street # 9', 15206),
(260, '6345 Marchand Street # 10', 15206),
(261, 'Squirrel Hill', 15206),
(262, 'address1', 15260),
(263, 'sss', 15206),
(264, 'rgrt', 695581);

-- --------------------------------------------------------

--
-- Table structure for table `cuisine`
--

CREATE TABLE IF NOT EXISTS `cuisine` (
  `cuisine_id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cuisine`
--

INSERT INTO `cuisine` (`cuisine_id`, `name`) VALUES
(6, 'American'),
(2, 'Chinese'),
(10, 'Greek'),
(1, 'Indian'),
(5, 'Italian'),
(8, 'Korean'),
(4, 'Mediterranean'),
(9, 'Mexican'),
(3, 'Thai'),
(7, 'Turkish');

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(72),
(72),
(72),
(72),
(72),
(72),
(72),
(72),
(72),
(72),
(72);

-- --------------------------------------------------------

--
-- Table structure for table `item`
--

CREATE TABLE IF NOT EXISTS `item` (
  `item_id` int(11) NOT NULL,
  `cuisine_id` int(11) NOT NULL,
  `item_name` varchar(100) NOT NULL,
  `description` varchar(500) NOT NULL,
  `price` double(20,2) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=141 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `item`
--

INSERT INTO `item` (`item_id`, `cuisine_id`, `item_name`, `description`, `price`) VALUES
(1, 1, 'Paneer Tikka Masala', 'Paneer cheese cubes simmered in onions, bell pepper, tomatoes, and onions.', 12.99),
(2, 1, 'Dal Fry', 'Yellow lentils spiced with Indian spices.', 11.99),
(3, 1, 'Channa Masala', 'Garbanzo beans cooked in a delicate tomato and onion sauce.\r\n\r\nGarbanzo beans cooked in a delicate tomato and onion sauce.\r\nGarbanzo beans cooked in a delicate tomato and onion sauce.\r\n\r\nGarbanzo beans cooked in a delicate tomato and onion sauce\r\n', 10.99),
(4, 1, 'Roti', 'Whole wheat flat bread baked in the tandoor oven.', 2.49),
(5, 1, 'Rasmalai', 'Two pieces. Snowy floats of sweetened milk in flavored rosewater garnished with pistachio nuts.', 4.99),
(6, 1, 'Chicken Korma', 'A Moghulai delight. Creamy, sweet and spicy with the delicate flavor of cardamom.', 11.99),
(7, 1, 'Shrimp Curry', 'A south Indian style curry', 14.99),
(8, 1, 'Chicken Tikka', 'Boneless chicken marinated with spices and cooked in the tandoor.', 12.99),
(9, 1, 'Channa Batura', 'A large puffy bread served with chicken peas curry', 7.99),
(10, 1, 'Garlic Naan', 'Roasted bread with garlic baked in the tandoor.', 2.99),
(11, 1, 'Chicken Makhani', 'Boneless chicken, breast simmered in tomatoes, cream and butter', 12.99),
(12, 1, 'Baingan Bhartha', 'Eggplant cooked in south Indian style.', 10.99),
(13, 1, 'Raita', 'Indian style side', 1.99),
(14, 1, 'Masala Chai', 'Spiced milky tea', 3.99),
(15, 1, 'Tandoori Chicken', 'Chicken marinated in yogurt, fresh spices barbecued in tandoor.', 11.99),
(16, 2, 'Dim Sums', 'Small bite-sized rounds stuffed with veggies or meat.', 5.99),
(17, 2, ' Hot and Sour Soup', 'Lists10 Most Popular Chinese Dishes | Easy Chinese Dishes\r\n10 Most Popular Chinese Dishes | Easy Chinese Dishes NDTV Food  |  Updated: February 07, 2019 15:37 ISTTweeterfacebook Reddit\r\n10 Most Popular Chinese Dishes | Easy Chinese Dishes\r\nChinese Recipes- In a country where the traditional way to greet someone translates to ''have you eaten yet?'' (ni chile ma), be rest assured, the food will be extraordinary. China has the most popular culinary heritage in the world. The history of their cuisine', 7.50),
(18, 2, 'Quick Noodles', 'One of the staples in every Chinese home.', 4.99),
(19, 2, 'Szechwan Chilli Chicken', 'A fiery delight straight from the Sichuan region.', 8.50),
(20, 2, 'Spring Rolls', 'A crisp appetizer where shredded veggies are encased in thin sheets and then fried golden.', 6.99),
(21, 2, ' Stir Fried Tofu with Rice', 'A simple stir-fry with tofu and Oriental sauces. ', 8.99),
(22, 2, 'Shitake Fried Rice with Water Chestnuts', 'Mushrooms and water chestnuts are used frequently in Chinese cooking.', 6.99),
(23, 2, 'Chicken with Chestnuts', 'This earthy recipe is perfect for a holiday feast.\r\n', 8.99),
(24, 2, 'Date Pancakes', 'Pancakes are like a blank canvas, ever so versatile', 3.99),
(25, 2, 'Wok Tossed Veggies in Honey and Black Bean Glaze', 'A colorful melange of veggies like chestnuts, mushrooms, Chinese cabbage - all tossed in honey and black bean sauce.', 8.99),
(26, 2, 'Beijing Duck', 'the duck skin either accompanies the meat or is served on another plate.', 6.99),
(27, 2, 'Hot Pot', 'include vinegar, BBQ sauce, spicy oils, finely cut herbs, and meats, sesames and pastes', 12.99),
(28, 2, ' Hong Shao Rou', 'Red Braised Pork Belly', 9.99),
(29, 2, 'Dumplings ', 'Fried, boiled, veggie or meaty', 5.99),
(30, 2, 'Biang Biang Mian', 'include egg, meat, tomato, small diced potato and much more. The noodles are the layer below this and they sit in a little pool of oily sauce.', 13.99),
(31, 3, 'Thai Tea Boba\r\n', 'Tea with edible black boba balls', 3.00),
(32, 3, 'Five Piece Spring Rolls\r\n', 'Mixed vegetables, bean threads wrapped in egg roll skin, deep fried and served with plum sauce.', 5.95),
(33, 3, 'Coconut Chicken Soup\r\n', 'Spicy, sour coconut soup with chicken, lemongrass, galangal, mushrooms, tomato, chili and lime juice. Hot and spicy.', 9.95),
(34, 3, 'Orange Chicken a la Carte\r\n', 'Chicken in orange sauce', 8.95),
(35, 3, 'Satay', 'Choice of meat on skewer, BBQ beef served with peanut sauce and cucumber salad.', 8.95),
(36, 3, 'Thai Dumpling\r\n', 'Served with shrimp, ground chicken, vegetable and served with black soy sauce.', 6.95),
(37, 3, 'Mee Krob\r\n', 'Sweet crispy noodles with shrimp, chicken and bean sprouts.', 7.95),
(38, 3, 'Fried Gyoza\r\n', 'Ground chicken and vegetables served with black soy sauce.', 6.95),
(39, 3, 'Cream Cheese Wonton\r\n', 'Cream cheese stuffed in wonton skin, deep fried, served with sweet and sour sauce.', 6.95),
(40, 3, ' Spicy and Sour Seafood Soup\r\n', 'Spicy, sour soup with a combination of seafood, lemongrass, galangal, mushrooms, tomato, chili and lime juice. Hot.', 13.95),
(41, 3, 'Thai Salad\r\n', 'Green salad with tomatoes, cucumber, onion and topped with a hard-boiled egg. Served with famous peanut dressing.', 7.95),
(42, 3, 'Steamed White Rice\n', 'Steamed White Rice\r\n', 1.50),
(43, 3, 'Fried Tofu\r\n', 'Served with crushed peanuts, sweet and sour sauce.', 6.96),
(44, 3, 'Yen Tafo Noodle Soup\r\n', 'Flat rice noodles with shrimps, fish balls, squid, fried tofu, flat noodles, spinach in red hot and sour soup. Hot and spicy.', 9.95),
(45, 3, 'Coconut Seafood Soup\r\n', 'Spicy, sour coconut soup with a combination of seafood, lemongrass, galangal, mushrooms, tomato, chili and lime sauce. Hot and spicy.', 14.95),
(46, 4, 'Mercimek Chorba', 'contains red lentils with carrots, butter, onions, and potatoes', 5.22),
(47, 4, 'Tavuk Chorba', 'Chicken, celery, carrots, parsley, and rice in chicken broth; homemade soup tasting like our grandma''s', 6.00),
(48, 4, 'Hummus', 'Chickpeas mashed with crushed sesame called tahini, our house herb blend, and olive oil drizzle', 0.00),
(49, 4, 'Charred Eggplant', 'Turkish style babaganoush flavored with garlic, extra virgin olive oil, and lightened up by yogurt', 6.00),
(50, 4, 'Labne', 'Traditional natural yogurt whipped with our house herb blend, crunchy walnuts, and olive oil', 6.00),
(51, 4, 'Tabbouleh', 'Exotic bulgur wheat dish made with parsley, green & red peppers, dill, and scallions, seasoned with our special house sauce', 6.00),
(52, 4, 'Chicken Shish Kebab', 'Chargrilled skewered diced chicken breast marinated for 24 hours in our traditional marinade', 7.00),
(53, 4, 'Mixed Cold Appetizers', 'All our traditional cold meze served with  feta cheese, good to share with two people', 6.00),
(54, 4, 'Stuffed Grape Leaves', 'Handmade, cooked grape leaves stuffed with rice and spices for refreshing taste', 7.00),
(55, 4, 'Chef Börek', 'Deep fried phyllo dough stuffed with goat cheese and leeks, served over our homemade tomato marmalade\r\n', 5.50),
(56, 4, 'Grilled Veggies', 'Garden fresh zucchini, eggplant, onions, leeks, green & red peppers, carrots and tomatoes, grilled to perfection', 7.00),
(57, 4, 'Chargrilled Salmon & Seafood Ravioli', 'Chargrilled wild caught North Atlantic salmon over seafood ravioli baked in oven with our special cream sauce, sprinkled with parmesan cheese, and served with fresh house salad', 6.50),
(58, 4, 'Shepherd Salad', 'Fresh diced tomatoes, green and red peppers, red onions, parsley, and cucumbers, seasoned with our house herb blend, served with fresh lemon juice, and olive oil', 4.99),
(59, 4, 'Greek Salad', ' Mixed greens topped with kalamata & stuffed green olives, feta cheese, cucumbers and tomatoes, seasoned with olive oil ', 6.00),
(60, 4, 'Lamb Sauté', 'Diced lamb with sautéed onions, peppers, garlic, tomatoes, mushrooms in tomato sauce', 19.00),
(61, 5, 'Stuffed Banana Peppers ', 'Spicy Peppers combined with Judy''s special sausage filling, and baked with her famous tomato sauce. ', 4.50),
(62, 5, 'Rolantini di Melenzane', 'Eggplant cut to length is lightly breaded and browned in virgin olive oil. Then rolled with a specially mixed ricotta cheese and baked with marinara sauce and a sprinkle of grated romano cheese. \r\n', 5.90),
(63, 5, 'Stuffed Mushroom Caps ', 'Fresh mushrooms filled with specially seasoned bread crumbs & baked golden brown. \r\n', 4.90),
(64, 5, 'Cavatelli e Verdure di Rena ', 'This flavorful dish of is prepared in the Basilicata fashion. Spinach steamed and sautéed with virgin olive oil and garlic, is then mixed together', 4.99),
(65, 5, 'Pasta Marinara ', 'your choice of spaghetti or penne topped with Judys famous tomato sauce.\r\n', 6.69),
(66, 5, 'Melenzane Romano ', 'Fresh eggplant lightly battered and browned in olive oil, layered with marinara sauce and grated romano cheese; then baked to perfection.', 6.99),
(67, 5, 'Alfredo di Piemonte ', 'This thick and rich Northern Italian sauce is a favorite of many. Our creamy Alfredo sauce is made to order and served over a generous bed of linguine.', 6.99),
(68, 5, 'Bruchetta di Zarra ', 'Fresh Italian bread sliced thick is topped with spinach, mushrooms, and roasted red peppers.', 6.00),
(69, 5, 'Mussels di Palmieri ', 'New Zealand mussels on the half shell in spicy tomato and garlic sauce. ', 5.50),
(70, 5, 'Mussels di Johnny ', 'New Zealand mussels on the half shell in a delightful garlic & butter sauce. \r\n', 5.99),
(71, 5, 'Calamari Antipasto ', 'Fresh Calamari steamed and served chilled, mixed with balsamic vinaigrette, artichoke hearts, roasted red peppers, kalamata olives, diced almonds, and dried cranberries. \r\n', 5.00),
(72, 6, 'Steak & Eggs ', 'An 8-ounce strip steak is butter poached with aromatics and pan-seared, then served with two Rivendale Farms eggs any style, and potatoes. ', 5.99),
(73, 6, 'Beef & Potato Hash ', 'A take on Texas steak and hash, Chef Peraza’s preparation is cooked cazuela-style (one cooking pot) and served with pico de gallo, pasilla chili, crème fraiche, and a fried egg', 6.00),
(74, 6, 'local trout', 'BRAISED KALE, CRISPY CHICKPEA, SPICY POMODORO', 25.00),
(75, 6, 'heirloom carrots', 'FRESH RICOTTA CHEESE, OLIVE VINAIGRETTE, HAZELNUT', 9.00),
(76, 6, 'half heritage chicken ', 'CELERY ROOT, MUSTARD, CONFIT GARLIC, HERB SALAD', 21.00),
(77, 6, 'steak frites', 'SHOESTRING POTATOES, DEMI, TRUFFLE BUTTER', 28.00),
(78, 6, 'turkey club', 'TURKEY, LETTUCE, TOMATO, BACON, CAJUN MAYO, FRIES', 14.00),
(79, 6, 'lamb french dip', 'CARAMELIZED ONION, HORSERADISH CREAM, LAMB AU JUS, FRENCH ROLL, FRIES', 17.00),
(80, 6, 'lobster roll', 'LOBSTER, BIBB LETTUCE, TARRAGON AIOLI, BRIOCHE, OLD BAY HOUSE CHIPS', 21.00),
(81, 6, 'tuna bowl', 'ARRO GRAIN, PEA TENDRILS, CARROTS, KIMCHI CUCUMBER, SOFT BOILED EGG, AVOCADO, SHOYU', 21.00),
(82, 6, 'rotisserie chicken kale salad', 'KALE, CAULIFLOWER, FUJI APPLE, CHERRY TOMATO, RADISH, LEMON-HONEY VINAIGRETTE', 16.00),
(83, 6, 'sugar beets', 'SMOKED CREMA, SOPPRESSATA, SALSA VERDE', 9.00),
(84, 7, 'Lentil Soup', 'Made w/ Red Lentils, Tomato Sauce & Onions', 4.99),
(85, 7, 'Chicken Soup', 'Creamy Chicken Soup w/ Veggies', 5.99),
(86, 7, 'Hummus1', 'Mashed chickpeas, mixed with fresh lemon juice, minced garlic, olive oil and tahini.', 5.50),
(87, 7, 'Cigarette Borek with Feta', 'Phyllo dough stuffed with feta cheese and dill and pan fried until golden brown.', 6.95),
(88, 7, 'Cigarette Borek with Spinach', 'Phyllo dough stuffed with sauteed spinach cheese and dill and pan fried until golden brow.', 6.95),
(89, 7, 'Mixed Hot Appetizers', 'Mixture of cigarette borek, falafel, fried zucchini and spinach borek.', 15.95),
(90, 7, 'Potato Cigarette Borek', 'Phylo dough stuffed with potato, red pepper, paprika, onion.', 6.95),
(91, 7, 'Pan Fried Zuchini', 'Pan fried patties of grated zucchini with greenonions,feta cheese, carrot,dill,parsley,Turkish spices,eggs and flour.', 7.99),
(94, 7, 'Bronzino', 'Whole Fish served with grilled tomato and pepper, Rice or Turkish Spaghetti.', 21.95),
(95, 7, 'Whole Royal Dorado', 'Whole fish is served with Grilled tomato and pepper, Rice or Turkish Spaghetti.', 21.95),
(96, 7, 'Shrimp Kebab', 'Seasoned Grilled Shrimp comes with rice and Salad.', 18.95),
(97, 7, 'Chicken Shish Kebab1', 'Char-broiled chicken cubes, cooked on skewers and delicately marinated in Turkish spices. Served with home made rice, garnish salad and grilled tomatoes and peppers.', 13.95),
(98, 7, 'Chicken Adana Kebab', 'Seasoned ground chicken, cooked on skewers and delicately marinated in Turkish spices.', 13.95),
(99, 7, 'Chicken Gyro Turkish', 'Seasoned and marinated chicken, cooked on rotating skewers, thinly sliced. Served with home made rice, garnish salad and grilled tomatoes and peppers.', 13.95),
(100, 7, 'Lamb Chops', 'Marinated baby lamp chops grilled to perfection. Served with home made rice, garnish salad and grilled tomatoes and peppers.', 21.95),
(101, 7, 'Izgara Kofte', 'Char-boriled ground Lamb and Beef patties delicately seasoned with special house spices.', 13.95),
(102, 7, 'Baklava', 'Pistachio nestled between light layers of filo pastry and topped with butter syrup.', 5.95),
(103, 7, 'Rice Pudding', 'A pudding made by baking rice, milk and sugar.', 5.99),
(104, 7, 'Brown Topped Pudding', 'Milk and vanilla powder.', 6.99),
(105, 7, 'Kunefe', 'Desserts', 5.99),
(106, 8, 'Godeungeo Gui', 'Grilled Mackerel', 6.00),
(107, 8, 'Samgyeopsal Gui', 'Grilled Pork Belly, Hot Vegetables with\r\nAssorted Green Leaves and Homemade Ssamjang', 10.00),
(108, 8, 'Dak Bulgogi', 'Sautéed Marinated Slice Chicken and\r\nHot Vegetables with Assorted Green Leaves\r\n', 10.00),
(109, 8, 'Dwaeji Moksal Yangyeom Gui ', 'Sautéed Marinated Slice Pork Neck and\r\nHot Vegetables with Assorted Green Leaves\r\n', 10.00),
(110, 8, 'Kimchi Jeon', 'Kimchi Pancake', 11.00),
(111, 8, 'Haemul Pajeon', 'Seafood Pancake with Spring Onion', 12.00),
(112, 8, 'Dubu Kimchi', 'Stir-Fried Pork Belly and Kimchi with Blanched Bean Curd', 15.00),
(113, 8, 'Korean Style Braised Chicken', 'Braised Chicken with Carrot, Potato and Glass Noodle ', 19.00),
(114, 8, 'Kimchi Jjigae', 'Kimchi Stew', 20.00),
(115, 8, 'Dwaejigogi Suyuk ', 'Korean Style Boiled Slice Pork Belly with\r\nAssorted Green Leaves and Homemade Ssamjang', 22.00),
(116, 8, 'King’s Braised Spicy Pork Rib', 'Braised Spicy Pork Rib with Carrot and Potato ', 24.00),
(117, 8, 'Dolpan Jjukkumi Haemul Bokk-Eum', 'Stir-Fried Baby Octopus with Seafood in Hot Plate\r\n', 27.00),
(118, 8, 'Daeha Gui', 'Roasted Jumbo Shrimps, Hot Vegetables with\r\nAssorted Green Leaves and Homemade Ssamjang', 28.00),
(119, 8, 'Jeonbok Cho ', 'Broiled Abalone with Soy Sauce', 29.00),
(120, 9, 'Breakfast Burrito', 'Scrambled eggs, Oaxaca and jack cheese, roasted pepper and onion rajas, guacamole, fried potatoes, salsa verde, fresh tomato salsa, and crema.', 5.00),
(121, 9, 'Guacamole', 'Diced onions, serranos and cilantro, and tortilla chips.', 5.00),
(122, 9, 'Barrio Chopped Salad', 'Romaine, red cabbage, pickled red onions, avocado, corn, tomatoes, cotija cheese, and pumpkin seeds with buttermilk-cilantro dressing.', 5.50),
(123, 9, 'Al Pastor Taco Trio', 'three tacos on housemade corn tortillas. Thinly sliced marinated snake river farm pork sirloin, caramelized pineapple, shaved red onion, avocado salsa and cilantro.', 3.99),
(124, 9, 'Chipotle Braised Chicken Enchiladas', 'Jack and oaxaca cheese, crema and red pepper-onion rajas with choice of red or green sauce.\r\n\r\n', 6.99),
(125, 9, 'Traditional Pork Shoulder Carnitas', 'Salsa verde, guacamole, diced onions, and fresh tomato salsa served with corn tortillas.', 5.55),
(126, 9, 'Braised Pork Taquitos', 'Served with guacamole, crema, escabeche slaw and habanero salsa', 7.00),
(127, 9, 'Grilled Quesadilla', 'Oaxaca and jack cheese, roasted pepper and onion rajas, cascabel salsa, guacamole, and crema.', 6.99),
(128, 9, 'Nachos', 'Thick corn tortilla chips, queso quesadilla, pickled jalapenos, cascabel salsa, crema, fresh tomato salsa, guacamole, and cilantro. Add smoked mushrooms, braised chicken, braised pork, skirt steak, or pork al pastor.', 6.70),
(129, 9, 'Roasted Corn on the Cob', 'Pequin dusted corn, lima aioli, and cotija.', 5.00),
(130, 10, 'Avgolemono', 'Classic Organic Egg-Lemon Soup with Chicken Stock and Orzo.', 9.00),
(131, 10, 'Htenia', 'Seared Diver Scallops on a Bed of Santorinian Fava Puree.', 18.00),
(132, 10, 'Melitzana Feta', 'Eggplant Rolls Stuffed with Feta Cheese, Tomato Sauce, Organic Parsley.', 16.00),
(133, 10, 'Spanakopita', 'Traditional Spinach and Feta Pie.', 14.00),
(134, 10, 'Calamarakia', 'Fried or Grilled Calamari, Extra Virgin Olive Oil and Lemon Sauce.', 17.00),
(135, 10, 'Seftalia', 'Grilled Cypriot Style Meatballs, Bed of Tzatziki, Tomatoes, Onions, Cucumber.', 15.00),
(136, 10, 'Garides Saganaki', 'Braised Jumbo Shrimp in Fresh Tomato Sauce, Melted Greek Feta Cheese, Organic Herbs.', 17.00),
(137, 10, 'Pikilia', 'Traditional Spreads: Tarama, Melitzanosalata, Spicy Feta, and Tzatziki.', 19.00),
(138, 10, 'Dolmades', 'Grape Leaves Stuffed with Rice, Pine Nuts and Raisins, EVOO.', 13.00),
(139, 10, 'Gigantes', 'Braised Imported Giant Greek Lima Beans, Traditional Tomato Sauce.', 13.00),
(140, 10, 'Keftedes', 'Traditional Greek Style Meat Balls, Tomato Sauce.', 14.00);

-- --------------------------------------------------------

--
-- Table structure for table `ordr`
--

CREATE TABLE IF NOT EXISTS `ordr` (
  `ordr_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `rest_id` int(11) NOT NULL,
  `total_price` double(20,2) NOT NULL,
  `address_id` int(11) NOT NULL,
  `estimated_delivery_time` datetime NOT NULL,
  `delivery_flag` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `ordr_suborder`
--

CREATE TABLE IF NOT EXISTS `ordr_suborder` (
  `ordr_suborder_id` int(11) NOT NULL,
  `ordr_id` int(11) NOT NULL,
  `so_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `restaurant`
--

CREATE TABLE IF NOT EXISTS `restaurant` (
  `rest_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `city` varchar(100) NOT NULL,
  `zip_code` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=503 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `restaurant`
--

INSERT INTO `restaurant` (`rest_id`, `user_id`, `name`, `city`, `zip_code`) VALUES
(1, 384, 'Vivamus Euismod Urna Associates', 'Kalken', 81151),
(3, 387, 'Mauris Ut Associates', 'Hallein', 58859),
(9, 218, 'Ultrices Ltd', 'Ostrowiec ?wi?tokrzyski', 7575),
(10, 24, 'Et Arcu Imperdiet PC', 'Montreal', 54963),
(15, 182, 'Mollis Vitae Posuere Corporation', 'Puerto Montt', 845499),
(16, 228, 'Proin Mi Institute', 'Middlesbrough', 0),
(19, 195, 'Tincidunt Nibh Associates', 'Okigwe', 33327),
(22, 390, 'Libero PC', 'San Lorenzo Nuovo', 39726),
(26, 348, 'Scelerisque Consulting', 'Belcarra', 82936),
(28, 300, 'Nunc Id Enim Foundation', 'Senneville', 5584),
(39, 248, 'Mi Aliquam Gravida Company', 'Peterhead', 78),
(46, 75, 'Magna Company', 'Okotoks', 0),
(48, 203, 'Vitae Foundation', 'Cervinara', 713449),
(50, 362, 'Habitant Morbi Inc.', 'Leersum', 2512),
(51, 375, 'Malesuada Fames Ac Corporation', 'Moncrivello', 58501),
(58, 286, 'Enim Institute', 'Swan Hills', 7509),
(65, 97, 'Primis In Faucibus Institute', 'Gouy-lez-PiŽton', 1900),
(70, 93, 'Vulputate Eu Foundation', 'Raymond', 6909),
(73, 78, 'Sed Malesuada Institute', 'Veere', 15608),
(74, 23, 'Metus Facilisis LLC', 'Benalla', 8263),
(75, 93, 'Tincidunt Dui Inc.', 'Wolfenbüttel', 7816),
(78, 214, 'Nec Mauris Blandit Inc.', 'Nandyal', 88),
(81, 149, 'Gravida Company', 'Coquitlam', 35775),
(91, 111, 'Fusce Foundation', 'Kawartha Lakes', 50917),
(99, 93, 'Nulla Facilisis Incorporated', 'Schiltigheim', 9540),
(101, 308, 'Nulla Integer Urna Institute', 'Horsham', 146263),
(102, 96, 'Tellus Id Nunc Foundation', 'Yerbas Buenas', 0),
(114, 195, 'Lorem Donec Industries', 'Remscheid', 9642),
(123, 214, 'Mi Associates', 'Copertino', 21708),
(126, 85, 'Quisque Ac LLP', 'Lithgow', 0),
(128, 267, 'Velit In Corp.', 'Moorsele', 4677),
(133, 387, 'In Industries', 'Hamme-Mille', 58965),
(140, 139, 'Aliquet Sem LLP', 'Halesowen', 622290),
(147, 297, 'Sagittis Semper Incorporated', 'Altavilla Irpina', 53704),
(148, 319, 'Vehicula Risus PC', 'St. John''s', 2346),
(163, 61, 'Penatibus Et PC', 'Daska', 955034),
(171, 354, 'Lorem Inc.', 'Maiolati Spontini', 50002),
(183, 362, 'Nec Inc.', 'Wiener Neustadt', 59518),
(185, 248, 'Ipsum Primis Inc.', 'Tramutola', 664910),
(188, 35, 'Orci Quis Lectus PC', 'Amberloup', 60315),
(189, 400, 'Elit LLC', 'Rotheux-RimiŽre', 496842),
(193, 319, 'Curae; Donec LLC', 'Preore', 27270),
(194, 55, 'Orci In PC', 'Scalloway', 7481),
(200, 85, 'Nunc Associates', 'Cagnes-sur-Mer', 25339),
(202, 247, 'Amet Consectetuer Adipiscing Foundation', 'Mauá', 0),
(207, 190, 'Risus Donec Nibh Ltd', 'Boignee', 2777),
(210, 319, 'Interdum Curabitur Dictum Institute', 'Erembodegem', 8500),
(211, 36, 'Mi Company', 'Romano d''Ezzelino', 378745),
(212, 130, 'Tortor Nibh Sit Corporation', 'Bouge', 70432),
(213, 343, 'Dapibus Id Blandit Ltd', 'Minitonas', 9904),
(222, 139, 'Sem Molestie Sodales PC', 'Guysborough', 14284),
(225, 397, 'Nulla Incorporated', 'Ravels', 454679),
(230, 243, 'Mauris A Inc.', 'Nederhasselt', 0),
(231, 24, 'Sed Congue Ltd', 'Barrackpur', 61343),
(233, 367, 'Ridiculus Mus Proin Institute', 'Grande Cache', 1970),
(234, 387, 'Consequat Ltd', 'Middelburg', 0),
(240, 287, 'Consectetuer Rhoncus Nullam Associates', 'Mandela', 59822),
(253, 203, 'Id Erat Associates', 'Cargovil', 2995),
(254, 323, 'Aliquam Adipiscing Lacus Institute', 'Longano', 838443),
(255, 324, 'Pellentesque Corporation', 'Nijmegen', 1749),
(263, 234, 'Diam Lorem Consulting', 'Windsor', 83869),
(269, 354, 'In Cursus Company', 'Daly', 89264),
(270, 61, 'Amet Diam Eu Corp.', 'Inveraray', 93),
(271, 343, 'Dui Nec Tempus Associates', 'Berloz', 38286),
(274, 35, 'Nec LLC', 'Essex', 33374),
(275, 85, 'Vitae Aliquam Eros Ltd', 'Torella del Sannio', 52976),
(276, 59, 'Nisi Cum Consulting', 'Cartagena', 9105),
(280, 121, 'Donec Est Nunc Industries', 'Amqui', 127203),
(282, 366, 'A Neque Corp.', 'Lisieux', 4407),
(285, 294, 'Neque Venenatis Lacus LLP', 'Fort Laird', 66083),
(288, 286, 'Donec Feugiat Incorporated', 'Baltimore', 2086),
(289, 297, 'Adipiscing Enim Mi Industries', 'Futrono', 413037),
(290, 362, 'Luctus LLC', 'Bruckneudorf', 78383),
(291, 394, 'Sit Amet Consulting', 'La Cruz', 21810),
(292, 139, 'Blandit Congue In LLP', 'Chichester', 21419),
(295, 55, 'Elit LLC', 'Kahramanmara?', 99831),
(299, 228, 'Ut Nulla Cras PC', 'Villa Verde', 0),
(302, 190, 'Venenatis A PC', 'Mayerthorpe', 636218),
(304, 384, 'Viverra Donec Consulting', 'Hisar', 72142),
(305, 186, 'Nam Tempor Inc.', 'Leersum', 4708),
(307, 286, 'Luctus LLC', 'Lo Prado', 17514),
(309, 400, 'Non Vestibulum PC', 'Narbolia', 74766),
(313, 275, 'Ultrices Sit Amet LLP', 'Paal', 51815),
(318, 36, 'Id Institute', 'Elx', 8696),
(321, 335, 'Adipiscing Non Luctus LLC', 'Kuringen', 21866),
(323, 243, 'Quam Vel Sapien Ltd', 'Capena', 230263),
(330, 228, 'Arcu Company', 'Eindhout', 137752),
(334, 62, 'Quisque Inc.', 'Giustino', 7285),
(335, 121, 'Etiam Vestibulum LLC', 'Anand', 4386),
(343, 118, 'Dui Nec Industries', 'Essex', 7226),
(356, 370, 'Donec Tincidunt Inc.', 'Dabgram', 19898),
(358, 96, 'Mauris Magna Inc.', 'Monteleone di Spoleto', 5940),
(367, 400, 'Risus Nunc Ac Company', 'Sagamu', 44814),
(372, 343, 'Ac Inc.', 'Sissa', 452),
(373, 396, 'Ornare Egestas Ligula Ltd', 'Santa Cruz', 2777),
(375, 286, 'Duis Incorporated', 'Bal?kesir', 13421),
(376, 97, 'Pede Blandit Incorporated', 'San Pedro de la Paz', 31708),
(378, 303, 'Molestie Tellus Incorporated', 'Caen', 0),
(379, 209, 'Odio Company', 'Dawson Creek', 60172),
(380, 100, 'Consequat Purus Maecenas Consulting', 'Thiaumont', 48783),
(381, 355, 'Fusce Mi Lorem LLC', 'Independence', 3455),
(391, 228, 'Non Institute', 'Acoz', 53076),
(394, 354, 'Urna Justo Faucibus Corp.', 'Wolfenbüttel', 48755),
(396, 319, 'Eu Dolor Corporation', 'Geest-GŽrompont-Petit-RosiŽre', 38271),
(399, 335, 'Conubia Nostra LLC', 'Fayetteville', 30518),
(401, 39, 'Congue Turpis LLC', 'Santomenna', 78189),
(406, 174, 'Est Corporation', 'Épernay', 75556),
(409, 319, 'Condimentum PC', 'Sterling Heights', 16336),
(414, 75, 'Elit Curabitur Industries', 'Signeulx', 6676),
(417, 275, 'Sed Sem Limited', 'Wabamun', 86053),
(418, 62, 'Sed Institute', 'Canterano', 68520),
(420, 100, 'Sem Magna Ltd', 'Casalvieri', 21006),
(423, 358, 'Nec Ante Industries', 'Rosolini', 83872),
(424, 398, 'Eget Limited', 'Rostock', 48650),
(426, 303, 'Leo LLC', 'Galvarino', 58594),
(427, 85, 'Ipsum Sodales PC', 'Bhilwara', 83441),
(430, 383, 'Vestibulum Nec Euismod Industries', 'Fochabers', 3350),
(435, 123, 'Felis Inc.', 'Hope', 667328),
(442, 335, 'Ac Risus Morbi Consulting', 'Annan', 907692),
(444, 297, 'Sed Eget PC', 'Santa Marina', 9394),
(446, 200, 'Faucibus Company', 'Massemen', 57358),
(449, 349, 'Nunc LLC', 'Augusta', 70319),
(468, 294, 'Erat Volutpat Nulla LLC', 'Lorient', 0),
(470, 348, 'Diam Nunc Industries', 'Zamora', 1235),
(474, 335, 'Ultrices Sit Amet LLP', 'Teodoro Schmidt', 712785),
(476, 317, 'Est Congue Industries', 'Toronto', 3905),
(495, 67, 'Fringilla Incorporated', 'Pitt Meadows', 4070),
(501, 384, 'Hooters', 'Pittsburgh', 15209),
(502, 384, 'Primanti Bros', 'Pittsburgh', 12345);

-- --------------------------------------------------------

--
-- Table structure for table `restaurant_cuisine`
--

CREATE TABLE IF NOT EXISTS `restaurant_cuisine` (
  `rest_cuisine_id` int(11) NOT NULL,
  `rest_id` int(11) NOT NULL,
  `cuisine_id` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=109 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `restaurant_cuisine`
--

INSERT INTO `restaurant_cuisine` (`rest_cuisine_id`, `rest_id`, `cuisine_id`) VALUES
(98, 3, 3),
(108, 3, 5),
(101, 3, 6),
(102, 3, 8),
(107, 3, 10),
(5, 15, 7),
(80, 99, 4),
(76, 114, 7),
(48, 163, 7),
(53, 207, 7),
(16, 222, 8),
(87, 253, 5),
(22, 255, 4),
(29, 282, 1),
(33, 305, 1),
(59, 307, 3),
(20, 313, 7),
(38, 373, 7),
(74, 373, 9),
(93, 379, 4),
(68, 380, 8),
(24, 391, 8),
(27, 391, 9),
(41, 420, 4),
(4, 435, 10);

-- --------------------------------------------------------

--
-- Table structure for table `restaurant_item`
--

CREATE TABLE IF NOT EXISTS `restaurant_item` (
  `rest_item_id` int(11) NOT NULL,
  `rest_id` int(11) NOT NULL,
  `item_id` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=197 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `restaurant_item`
--

INSERT INTO `restaurant_item` (`rest_item_id`, `rest_id`, `item_id`) VALUES
(69, 1, 63),
(183, 3, 35),
(184, 3, 36),
(185, 3, 37),
(186, 3, 38),
(187, 3, 39),
(188, 3, 40),
(193, 3, 70),
(194, 3, 71),
(195, 3, 80),
(196, 3, 81),
(68, 22, 30),
(174, 22, 83),
(160, 48, 28),
(124, 48, 126),
(147, 58, 102),
(22, 70, 140),
(129, 74, 46),
(50, 78, 53),
(54, 81, 2),
(20, 101, 38),
(78, 126, 19),
(56, 163, 10),
(61, 185, 40),
(100, 185, 110),
(24, 188, 13),
(13, 194, 20),
(82, 194, 41),
(81, 210, 25),
(149, 210, 57),
(143, 233, 73),
(162, 234, 135),
(11, 240, 18),
(136, 240, 30),
(97, 240, 43),
(180, 253, 9),
(166, 271, 17),
(12, 271, 28),
(94, 276, 82),
(106, 285, 9),
(5, 285, 101),
(83, 292, 32),
(102, 292, 116),
(30, 299, 113),
(111, 304, 127),
(141, 305, 32),
(77, 305, 90),
(114, 305, 121),
(140, 343, 96),
(158, 373, 14),
(64, 373, 113),
(98, 379, 11),
(6, 446, 121);

-- --------------------------------------------------------

--
-- Table structure for table `review`
--

CREATE TABLE IF NOT EXISTS `review` (
  `review_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `rest_id` int(11) NOT NULL,
  `stars` int(2) NOT NULL,
  `description` varchar(500) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `review`
--

INSERT INTO `review` (`review_id`, `user_id`, `rest_id`, `stars`, `description`) VALUES
(42, 384, 1, 100, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `suborder`
--

CREATE TABLE IF NOT EXISTS `suborder` (
  `so_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `rest_id` int(11) NOT NULL,
  `cuisine_id` int(11) NOT NULL,
  `item_id` int(11) NOT NULL,
  `quantity` int(50) NOT NULL,
  `total_price` double(20,2) NOT NULL,
  `spice_level` int(2) NOT NULL,
  `comment` varchar(500) NOT NULL,
  `status` tinyint(1) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `suborder`
--

INSERT INTO `suborder` (`so_id`, `user_id`, `rest_id`, `cuisine_id`, `item_id`, `quantity`, `total_price`, `spice_level`, `comment`, `status`) VALUES
(18, 384, 10, 1, 71, 10, 50.00, 4, '', 0);

-- --------------------------------------------------------

--
-- Table structure for table `user_login`
--

CREATE TABLE IF NOT EXISTS `user_login` (
  `user_id` int(11) NOT NULL,
  `user_name` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL,
  `full_name` varchar(100) NOT NULL,
  `member_type` int(1) DEFAULT NULL,
  `user_type` int(1) NOT NULL,
  `email` varchar(100) NOT NULL,
  `contact_number` varchar(100) NOT NULL,
  `joined_on` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `address_id` int(11) NOT NULL,
  `login_status` tinyint(1) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=414 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_login`
--

INSERT INTO `user_login` (`user_id`, `user_name`, `password`, `full_name`, `member_type`, `user_type`, `email`, `contact_number`, `joined_on`, `address_id`, `login_status`) VALUES
(9, 'Inez', 'WRL96AZB0BV', 'Plato Hall', 2, 1, 'lectus.pede@sitametornare.net', '768-9048', '2012-03-18 04:00:00', 182, 1),
(14, 'Aladdin', 'HAS12NPJ4SW', 'Beck Chase', 1, 1, 'neque.In.ornare@ipsumdolor.net', '1-340-813-2975', '2012-05-19 04:00:00', 157, 1),
(17, 'Aiko', 'OZJ35STQ8MS', 'Eagan Salazar', 3, 1, 'neque@velit.co.uk', '818-3686', '2001-03-20 04:00:00', 8, 1),
(23, 'Kevyn', 'LZZ38XII2XN', 'Kai Wood', 3, 1, 'arcu.imperdiet.ullamcorper@liberoIntegerin.edu', '601-1964', '2003-06-20 04:00:00', 242, 0),
(24, 'Roth', 'DRM44JYL4FC', 'Drew Pitts', 1, 1, 'sagittis.semper.Nam@loremeget.co.uk', '723-5354', '2007-03-18 04:00:00', 240, 1),
(27, 'Megan', 'YNF70JTR1KP', 'Uriel Flores', 3, 1, 'tristique.aliquet@Integersemelit.net', '379-0364', '2003-01-19 05:00:00', 58, 1),
(32, 'Roanna', 'NWQ19PDE8VF', 'Hiram Emerson', 3, 2, 'Fusce.dolor@et.com', '1-970-643-1192', '2010-08-18 04:00:00', 1, 0),
(35, 'Sierra', 'LRQ53OSI6TX', 'Kirk Wood', 1, 1, 'diam@Phasellusfermentum.org', '1-917-698-7276', '2008-01-19 05:00:00', 72, 1),
(36, 'Laith', 'DRK70SQQ2XO', 'Stuart Mcfadden', 2, 1, 'lacus@ultriciesornare.co.uk', '1-292-906-0729', '2002-07-20 04:00:00', 134, 1),
(39, 'Fritz', 'LES41OWU5RZ', 'Austin Mcpherson', 2, 1, 'lobortis.Class.aptent@veliteu.edu', '1-246-394-0533', '2010-11-18 05:00:00', 18, 0),
(55, 'Patience', 'VHV47DRX9RI', 'Susan Fulton', 3, 1, 'nunc@Vivamusmolestie.com', '1-364-974-6272', '2008-01-19 05:00:00', 138, 1),
(59, 'Eleanor', 'SKL10XWB9LP', 'Hu Patterson', 2, 2, 'lectus.Nullam@dapibusligulaAliquam.ca', '1-354-449-2970', '2003-04-19 04:00:00', 147, 1),
(61, 'Erica', 'KNJ19ZAN0MO', 'Dale Ellison', 1, 2, 'malesuada@inaliquetlobortis.org', '1-777-334-4058', '2005-11-18 05:00:00', 48, 0),
(62, 'Reese', 'CLN16CVI5HU', 'Emma Bowen', 2, 1, 'tortor.dictum.eu@turpisnonenim.net', '393-3939', '2009-10-18 04:00:00', 69, 1),
(64, 'Alexander', 'MVL57PBD5XX', 'Bernard Murphy', 2, 2, 'arcu@commodohendrerit.org', '1-389-770-1194', '2004-02-20 05:00:00', 103, 1),
(67, 'Catherine', 'TZM97QTQ1SE', 'Aspen Noble', 2, 2, 'feugiat.nec.diam@commodoatlibero.net', '331-1333', '2011-12-19 05:00:00', 32, 1),
(75, 'Herrod', 'RKD52AGR3TO', 'Galvin Patterson', 2, 1, 'nisi@Nullasempertellus.co.uk', '498-9100', '2003-06-19 04:00:00', 227, 0),
(78, 'Vielka', 'SWQ39HKG6BO', 'Silas French', 1, 1, 'fermentum.metus@sedorcilobortis.org', '1-484-250-6233', '2012-02-18 05:00:00', 5, 1),
(85, 'Chelsea', 'ZWU38UEO9PC', 'Emma Benjamin', 1, 2, 'urna.Nunc.quis@adipiscingligula.co.uk', '974-3896', '2010-10-18 04:00:00', 202, 0),
(93, 'Hermione', 'XGN66MYB9HJ', 'Daryl Pierce', 3, 1, 'dictum.augue.malesuada@Sed.org', '116-4409', '2002-04-19 04:00:00', 76, 0),
(95, 'Lysandra', 'QLW22BIS1HG', 'Lila Lynn', 1, 1, 'urna.nec@Loremipsumdolor.ca', '1-732-715-5888', '2004-12-18 05:00:00', 135, 0),
(96, 'Aimee', 'RVA58ZRQ1OW', 'Mikayla Moore', 3, 1, 'ac@portaelit.org', '829-1321', '2011-12-18 05:00:00', 172, 1),
(97, 'Hilda', 'IXJ73WRU5EV', 'Amela Molina', 3, 1, 'ornare.sagittis@aliquetliberoInteger.co.uk', '387-7421', '2001-08-19 04:00:00', 194, 0),
(100, 'Colette', 'VAO06NPS1MM', 'Autumn Bean', 2, 1, 'gravida.nunc.sed@Aeneaneuismod.edu', '1-217-388-4342', '2004-12-18 05:00:00', 228, 0),
(101, 'Risa', 'PHQ48ADD4SF', 'Imogene Contreras', 3, 1, 'mollis.lectus.pede@necmollisvitae.com', '444-9154', '2009-08-19 04:00:00', 43, 1),
(111, 'Isaiah', 'BNK69DLO4QJ', 'Quincy Harrison', 2, 1, 'eu.dolor@Aliquamadipiscinglobortis.edu', '535-9768', '2006-02-18 05:00:00', 35, 1),
(118, 'Grady', 'RMN59QQB8RU', 'Keith Ray', 1, 2, 'scelerisque.lorem@vestibulumneque.co.uk', '1-529-113-2328', '2011-04-18 04:00:00', 75, 0),
(121, 'Tate', 'PGK31SJY9QE', 'Julian Conway', 2, 2, 'vel.sapien.imperdiet@Cumsociisnatoque.net', '625-4517', '2009-09-19 04:00:00', 135, 0),
(123, 'Donna', 'AIY51AJR8YX', 'Iona Blake', 3, 1, 'consequat.dolor@In.ca', '830-8920', '2006-08-18 04:00:00', 35, 0),
(125, 'Cleo', 'DBY27XBU1HL', 'Kenyon Huffman', 1, 2, 'Proin.nisl.sem@erosNamconsequat.edu', '312-5744', '2001-02-19 05:00:00', 15, 1),
(129, 'Cara', 'QJR43DCO8MB', 'Sonya Pena', 2, 1, 'vulputate.eu@morbitristiquesenectus.co.uk', '837-9617', '2003-02-19 05:00:00', 54, 1),
(130, 'Zorita', 'SIA52WHB1IO', 'Tashya Hendricks', 2, 1, 'et@a.org', '423-7150', '2006-10-19 04:00:00', 123, 0),
(131, 'Oliver', 'ZCF20HSS5HE', 'Denton Hubbard', 2, 1, 'Cras.eget.nisi@et.edu', '807-5248', '2012-04-18 04:00:00', 143, 0),
(139, 'Cain', 'SKW90UPS0TL', 'Louis Ross', 1, 2, 'Nullam.lobortis@turpisNullaaliquet.co.uk', '1-341-839-2497', '2011-08-19 04:00:00', 70, 0),
(142, 'Vivian', 'VBJ79XSW1BQ', 'Michelle Jacobs', 3, 2, 'vel.convallis.in@Pellentesque.net', '1-672-236-5754', '2006-10-19 04:00:00', 76, 0),
(146, 'Cade', 'DCA58YYI2MU', 'Kasper Webster', 3, 1, 'Aliquam.erat.volutpat@ullamcorper.co.uk', '320-2223', '2010-11-18 05:00:00', 131, 1),
(148, 'Gabriel', 'RDQ23GAY6TH', 'Mia Gallegos', 1, 1, 'eu.enim.Etiam@at.edu', '1-733-180-5401', '2009-01-18 05:00:00', 165, 0),
(149, 'Karina', 'ANX88ELW7OM', 'Lydia Dodson', 1, 1, 'fermentum.convallis.ligula@atauctor.com', '990-1415', '2008-04-19 04:00:00', 171, 0),
(160, 'Jade', 'XVZ32OEP8HE', 'Latifah Mccarthy', 3, 1, 'sed@utnisia.com', '974-0114', '2002-08-19 04:00:00', 248, 0),
(174, 'Phelan', 'HZP78DGT4JL', 'Jason Nielsen', 2, 2, 'turpis.nec.mauris@quisurnaNunc.co.uk', '995-1368', '2005-01-19 05:00:00', 221, 1),
(175, 'Zia', 'QYN83XWR3II', 'Sade Spears', 1, 2, 'tempus.lorem@euismodin.org', '1-209-643-7970', '2010-01-19 05:00:00', 12, 0),
(181, 'Caldwell', 'DZF63IVZ1VN', 'Piper Cochran', 3, 1, 'congue.a@lorem.com', '124-1327', '2009-07-18 04:00:00', 130, 1),
(182, 'David', 'RJU66CVI1CK', 'Keelie Wiley', 3, 1, 'sem.Pellentesque@velit.net', '587-3633', '2012-11-18 05:00:00', 97, 1),
(186, 'Regina', 'WIU39HDR7OA', 'Samson Bowman', 2, 1, 'mi.eleifend.egestas@Nam.ca', '1-407-264-8674', '2008-10-18 04:00:00', 82, 1),
(190, 'Slade', 'AFB82GCT6XQ', 'Xantha Cherry', 3, 2, 'sed@sodalesMaurisblandit.com', '1-334-200-7067', '2007-08-19 04:00:00', 225, 1),
(192, 'Yolanda', 'ILU61IHQ0MU', 'Kirk Valencia', 3, 1, 'eu.ligula@consequatnec.edu', '404-1733', '2001-09-20 04:00:00', 207, 1),
(195, 'Maisie', 'RJX29WUB8BW', 'Victor Ramsey', 1, 1, 'mauris@egestas.org', '538-5249', '2005-09-19 04:00:00', 105, 0),
(200, 'Callie', 'HHN37DAQ4EJ', 'Emi Key', 1, 2, 'condimentum.Donec@lacus.net', '1-510-826-6331', '2002-06-19 04:00:00', 212, 0),
(203, 'Sopoline', 'ZEC06ICG3BP', 'Idona Pruitt', 3, 2, 'vel@conubia.net', '713-2609', '2012-01-19 05:00:00', 36, 1),
(209, 'Ursa', 'KNU51EQP9DY', 'Keegan Palmer', 2, 2, 'Maecenas@convallisantelectus.edu', '109-6631', '2004-02-20 05:00:00', 157, 1),
(214, 'Macon', 'NKL76RAJ5UQ', 'Chaney Estes', 2, 2, 'per.conubia@ac.edu', '671-4859', '2009-08-18 04:00:00', 3, 1),
(218, 'Illana', 'VHN63RSW5IE', 'Joseph Mcmahon', 1, 2, 'Integer.eu@vulputatevelit.net', '1-462-180-3856', '2004-10-20 04:00:00', 121, 1),
(225, 'Alisa', 'FYQ41VKK7IY', 'Robert Nguyen', 3, 1, 'imperdiet.nec@Maecenas.edu', '1-205-195-3266', '2008-11-19 05:00:00', 196, 0),
(228, 'Finn', 'ECU34VWV0YZ', 'Keane Foster', 1, 1, 'Quisque.porttitor@lacusQuisque.org', '767-6921', '2010-08-19 04:00:00', 94, 0),
(231, 'Lara', 'PZE41HVV9TZ', 'Noelle Riggs', 3, 1, 'Sed.nulla@nibh.net', '986-6637', '2003-12-20 05:00:00', 192, 1),
(233, 'Yvette', 'IEG85LKO2OA', 'Dominic Osborn', 3, 2, 'primis.in.faucibus@elementumpurus.ca', '621-6408', '2008-09-19 04:00:00', 62, 0),
(234, 'Kimberley', 'PJG27ZHZ3XS', 'Lars Mullins', 1, 1, 'at.pede@non.ca', '753-3191', '2012-11-18 05:00:00', 238, 0),
(237, 'Alexandra', 'BPU20ZAS2PB', 'Rana Schroeder', 3, 1, 'non@Etiambibendumfermentum.com', '215-7567', '2012-09-19 04:00:00', 189, 1),
(243, 'Brock', 'IYB59KNN5PK', 'Venus Whitehead', 1, 1, 'torquent@Donec.ca', '625-2659', '2001-06-20 04:00:00', 170, 0),
(247, 'Emily', 'NFD04YVC2EO', 'Keefe Solomon', 2, 1, 'dui.semper@tinciduntnibhPhasellus.edu', '1-128-438-3381', '2003-02-20 05:00:00', 196, 1),
(248, 'Ferris', 'HDU73GKR4YN', 'Seth Gonzales', 3, 2, 'adipiscing@volutpatNulladignissim.com', '1-414-257-2882', '2002-01-19 05:00:00', 117, 1),
(254, 'Justin', 'BVN49UMZ7IJ', 'Hillary Owen', 2, 1, 'lorem@dolor.net', '533-2948', '2007-09-19 04:00:00', 232, 0),
(259, 'Moses', 'PWV50HTJ0PS', 'Damon Vinson', 2, 2, 'Donec.luctus.aliquet@tellus.com', '1-612-300-3130', '2006-08-18 04:00:00', 189, 0),
(265, 'Ingrid', 'KDH45ITI5TS', 'Ingrid Hampton', 1, 2, 'aliquet.magna@sitamet.co.uk', '355-1914', '2007-03-19 04:00:00', 16, 0),
(267, 'Sasha', 'YYN73AEE3MG', 'Kirby Holman', 1, 1, 'tincidunt.nunc.ac@malesuada.edu', '1-318-115-9820', '2007-06-18 04:00:00', 147, 0),
(275, 'Raphael', 'OKA07LOM2IC', 'Octavius Emerson', 3, 2, 'et.lacinia@sem.org', '1-557-699-5798', '2011-01-18 05:00:00', 128, 0),
(282, 'Isabella', 'JVG11JGT1GI', 'Hedy Vargas', 2, 2, 'pellentesque.massa.lobortis@enim.edu', '1-287-580-4195', '2012-02-18 05:00:00', 161, 0),
(286, 'Kane', 'ILY52CEJ5LL', 'Carly Andrews', 1, 2, 'vestibulum@miAliquam.org', '1-910-924-9759', '2011-03-18 04:00:00', 2, 1),
(287, 'Clarke', 'NAH48NFS6EE', 'Maisie Barker', 1, 1, 'pede.Cras.vulputate@ametornarelectus.edu', '702-9679', '2007-05-19 04:00:00', 5, 0),
(294, 'Odysseus', 'HFB97BBX9BG', 'Katell Hendrix', 2, 2, 'dictum.mi.ac@orci.co.uk', '618-1368', '2005-03-18 04:00:00', 65, 0),
(296, 'Rose', 'HLP72TPS5WU', 'Alden Hughes', 3, 1, 'eget.mollis.lectus@Cumsociis.org', '1-117-178-9189', '2007-11-18 05:00:00', 103, 1),
(297, 'Amethyst', 'ZGC33CED8EZ', 'Ishmael Pittman', 3, 2, 'dictum.mi.ac@eumetusIn.co.uk', '1-705-624-8764', '2011-12-18 05:00:00', 102, 0),
(300, 'Dexter', 'HJF57DZE5SH', 'Hope Day', 3, 1, 'ac@nisiMauris.org', '210-1343', '2001-07-20 04:00:00', 186, 1),
(303, 'Robin', 'BFG51PGW6LT', 'Travis Pate', 3, 1, 'odio@facilisisSuspendissecommodo.org', '1-548-640-1311', '2009-04-18 04:00:00', 216, 0),
(308, 'Teegan', 'ZWG29LDW6NG', 'Nissim Brewer', 3, 2, 'hendrerit.id@nislsem.net', '960-2898', '2011-04-19 04:00:00', 92, 1),
(317, 'Lareina', 'ZGU99BCQ3JR', 'Urielle Duffy', 3, 1, 'Sed.eu@eratvel.com', '416-2866', '2010-11-19 05:00:00', 156, 0),
(319, 'Mallory', 'MOY06QOC4YB', 'Brandon Albert', 1, 2, 'sed.consequat@nibh.com', '1-813-589-3728', '2003-10-19 04:00:00', 218, 0),
(323, 'Aristotle', 'LXE90BVP8LJ', 'Amela Terry', 3, 2, 'non.leo.Vivamus@Pellentesquehabitant.com', '1-228-653-2855', '2010-07-18 04:00:00', 25, 1),
(324, 'Kendall', 'JEB27MFV4IZ', 'Harlan Chavez', 3, 1, 'Praesent.interdum.ligula@mollisDuissit.edu', '1-382-146-7676', '2002-09-20 04:00:00', 107, 0),
(327, 'Britanney', 'CCZ47CZY2QI', 'Jana Franco', 2, 2, 'dapibus.rutrum.justo@Phasellusinfelis.com', '1-720-680-8318', '2004-04-20 04:00:00', 186, 0),
(331, 'Naomi', 'QJV61ZDN6QS', 'Charlotte Robinson', 1, 1, 'dolor.sit.amet@ategestas.ca', '1-515-942-1169', '2004-07-20 04:00:00', 52, 0),
(335, 'Nathan', 'CDR40HGP5VF', 'Yolanda Zamora', 1, 2, 'Sed@scelerisquescelerisque.co.uk', '1-674-190-8680', '2009-10-19 04:00:00', 206, 1),
(343, 'Bianca', 'YUL45QIC3CI', 'Salvador Casey', 1, 1, 'enim.nec@convallis.ca', '1-959-480-4986', '2012-01-19 05:00:00', 215, 1),
(348, 'Brody', 'UPW03KOC8LM', 'Lillith Yates', 2, 1, 'Nulla@varius.edu', '1-912-934-6714', '2001-04-19 04:00:00', 236, 0),
(349, 'Ariel', 'VCV64EVD8LZ', 'Quamar Yang', 3, 1, 'Donec.at@nislMaecenasmalesuada.co.uk', '916-4855', '2006-06-18 04:00:00', 196, 0),
(351, 'Benedict', 'NUX81YDU1DI', 'Ivan Kidd', 1, 1, 'Suspendisse@tristiquesenectuset.co.uk', '957-2542', '2008-04-19 04:00:00', 155, 1),
(354, 'Paul', 'OJU67KZK5KF', 'Abdul Molina', 1, 2, 'sem@necligula.net', '753-9483', '2001-11-19 05:00:00', 18, 1),
(355, 'Lionel', 'NCN02AFP8UQ', 'Wyatt Benjamin', 3, 2, 'sodales.at.velit@habitantmorbi.com', '1-932-804-3434', '2005-10-19 04:00:00', 180, 1),
(356, 'Timon', 'FGD26HAN3CK', 'Ishmael Cameron', 2, 1, 'Sed.pharetra.felis@mienim.edu', '1-108-669-3276', '2005-09-18 04:00:00', 190, 1),
(358, 'Pandora', 'HJE53ROV9SQ', 'Kiayada Stout', 1, 2, 'vehicula@arcu.co.uk', '325-3006', '2006-09-18 04:00:00', 230, 1),
(362, 'Hop', 'BHU71VOZ6UT', 'Ray Pacheco', 3, 2, 'dignissim.tempor@sitamet.edu', '1-893-739-8771', '2003-09-20 04:00:00', 65, 0),
(366, 'Jeremy', 'UVC74COX6SQ', 'Cassandra Goodman', 2, 1, 'neque@enim.ca', '1-254-186-0294', '2008-04-19 04:00:00', 189, 0),
(367, 'Nyssa', 'FWO07MEB4OA', 'Gloria George', 1, 1, 'ultricies@metusurnaconvallis.com', '1-152-280-5148', '2004-09-19 04:00:00', 190, 0),
(369, 'Beau', 'WVR27TWQ5TV', 'Beck Craft', 1, 1, 'enim.mi@at.co.uk', '1-731-845-5284', '2012-01-19 05:00:00', 77, 1),
(370, 'Rafael', 'OKB61HJC6BY', 'Colin Hunter', 3, 2, 'Fusce.fermentum@auctorullamcorpernisl.net', '1-941-598-9165', '2002-04-20 04:00:00', 176, 1),
(371, 'Skyler', 'UUO56WAM1KG', 'Flynn Patrick', 1, 1, 'ultrices.mauris.ipsum@acliberonec.org', '1-930-650-9319', '2005-02-18 05:00:00', 1, 1),
(375, 'Leigh', 'BWR65EMI2OY', 'Scarlett Morrow', 2, 1, 'mollis.lectus@mauris.ca', '389-2019', '2008-07-19 04:00:00', 51, 1),
(383, 'Josephine', 'ELR87MYX4BR', 'Ray Navarro', 3, 2, 'non@fermentummetus.co.uk', '554-0893', '2004-12-18 05:00:00', 7, 1),
(384, 'Amity', 'NAI98EUF8SO', 'Brendan Warner', 2, 2, 'arcu@magna.net', '989-6754', '2009-08-19 04:00:00', 100, 1),
(387, 'Eve', 'JUP05XAW2UW', 'Edward Randolph', 1, 1, 'hendrerit.Donec@Integervulputate.net', '1-482-857-2528', '2012-03-18 04:00:00', 195, 0),
(390, 'Mollie', 'XRL46IKN9RM', 'Hayley Owens', 2, 2, 'convallis@orciconsectetuer.edu', '932-5224', '2005-11-19 05:00:00', 130, 1),
(394, 'Blake', 'YGB75IHQ0CU', 'Phoebe Mcdowell', 3, 2, 'magna.nec.quam@temporarcuVestibulum.com', '1-618-528-4255', '2006-02-18 05:00:00', 209, 1),
(396, 'Callum', 'LDV49EXK9GW', 'Kerry Chen', 1, 1, 'quam.a@vehicula.ca', '1-443-848-0356', '2010-09-18 04:00:00', 117, 1),
(397, 'Steven', 'RUT95REG0CS', 'Berk Lawson', 3, 1, 'arcu.vel.quam@Nullamfeugiatplacerat.ca', '1-852-779-0045', '2006-01-19 05:00:00', 227, 1),
(398, 'Marshall', 'JAJ79DDC8JP', 'Raya Tran', 3, 2, 'lobortis.tellus.justo@dictumProineget.co.uk', '607-9885', '2006-03-18 04:00:00', 178, 0),
(400, 'Sylvester', 'QXY99EXH9OS', 'Ishmael Jacobson', 3, 1, 'pharetra.ut.pharetra@pulvinararcu.org', '203-9616', '2010-11-18 05:00:00', 99, 1),
(401, 'shdbsjhdb', 'dfdf', 'Varun Nair', 2, 0, 'chs263@pitt.edu', '4127087404', '2019-04-17 06:49:50', 252, 0),
(404, 'nayan', 'nine', 'nayan', 2, 0, 'nhs263@pitt.edu', '4127087401', '2019-04-17 06:58:20', 255, 0),
(408, 'nayannn', 'nine', 'nayannn', 2, 0, 'nhs5555@pitt.edu', '4127087405', '2019-04-17 06:59:53', 259, 0),
(411, 'test1', 'test1', 'test1', 2, 0, 'test1@gmail.com', '4127087409', '2019-04-17 07:12:10', 262, 0),
(412, 'test2', 'test2', 'test2', 2, 0, 'test2@g.com', '4127087499', '2019-04-17 07:15:51', 263, 0),
(413, 'test3', 'test3', 'test3', 1, 0, 'test3@g.com', '545455', '2019-04-17 07:17:16', 264, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `address`
--
ALTER TABLE `address`
  ADD PRIMARY KEY (`address_id`);

--
-- Indexes for table `cuisine`
--
ALTER TABLE `cuisine`
  ADD PRIMARY KEY (`cuisine_id`),
  ADD UNIQUE KEY `name` (`name`);

--
-- Indexes for table `item`
--
ALTER TABLE `item`
  ADD PRIMARY KEY (`item_id`),
  ADD UNIQUE KEY `item_name` (`item_name`),
  ADD KEY `cuisine_id` (`cuisine_id`);

--
-- Indexes for table `ordr`
--
ALTER TABLE `ordr`
  ADD PRIMARY KEY (`ordr_id`),
  ADD KEY `user_id` (`user_id`),
  ADD KEY `rest_id` (`rest_id`),
  ADD KEY `ord_add_fk` (`address_id`);

--
-- Indexes for table `ordr_suborder`
--
ALTER TABLE `ordr_suborder`
  ADD PRIMARY KEY (`ordr_suborder_id`),
  ADD UNIQUE KEY `ordr_id_2` (`ordr_id`,`so_id`),
  ADD UNIQUE KEY `UKfba29x2y4dsdsejssdvbwywn9` (`ordr_id`,`so_id`),
  ADD KEY `ordr_id` (`ordr_id`),
  ADD KEY `suborder_id` (`so_id`);

--
-- Indexes for table `restaurant`
--
ALTER TABLE `restaurant`
  ADD PRIMARY KEY (`rest_id`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `restaurant_cuisine`
--
ALTER TABLE `restaurant_cuisine`
  ADD PRIMARY KEY (`rest_cuisine_id`),
  ADD UNIQUE KEY `rest_id_2` (`rest_id`,`cuisine_id`),
  ADD UNIQUE KEY `UKqn2wj0ihi2fm0dvb5bvujcs8g` (`rest_id`,`cuisine_id`),
  ADD KEY `rest_id` (`rest_id`),
  ADD KEY `cuisine_id` (`cuisine_id`);

--
-- Indexes for table `restaurant_item`
--
ALTER TABLE `restaurant_item`
  ADD PRIMARY KEY (`rest_item_id`),
  ADD UNIQUE KEY `rest_id_2` (`rest_id`,`item_id`),
  ADD UNIQUE KEY `UKbx7veli0oh3g2vcqj87jtqa5a` (`rest_id`,`item_id`),
  ADD KEY `rest_id` (`rest_id`),
  ADD KEY `item_id` (`item_id`);

--
-- Indexes for table `review`
--
ALTER TABLE `review`
  ADD PRIMARY KEY (`review_id`),
  ADD KEY `user_id` (`user_id`),
  ADD KEY `rest_id` (`rest_id`);

--
-- Indexes for table `suborder`
--
ALTER TABLE `suborder`
  ADD PRIMARY KEY (`so_id`),
  ADD KEY `user_id` (`user_id`),
  ADD KEY `cuisine_id` (`cuisine_id`),
  ADD KEY `item_id` (`item_id`),
  ADD KEY `rest_id` (`rest_id`);

--
-- Indexes for table `user_login`
--
ALTER TABLE `user_login`
  ADD PRIMARY KEY (`user_id`),
  ADD UNIQUE KEY `email` (`email`),
  ADD UNIQUE KEY `contact_number` (`contact_number`),
  ADD UNIQUE KEY `user_name` (`user_name`),
  ADD KEY `address_id` (`address_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `address`
--
ALTER TABLE `address`
  MODIFY `address_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=265;
--
-- AUTO_INCREMENT for table `cuisine`
--
ALTER TABLE `cuisine`
  MODIFY `cuisine_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT for table `item`
--
ALTER TABLE `item`
  MODIFY `item_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=141;
--
-- AUTO_INCREMENT for table `ordr`
--
ALTER TABLE `ordr`
  MODIFY `ordr_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `ordr_suborder`
--
ALTER TABLE `ordr_suborder`
  MODIFY `ordr_suborder_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `restaurant`
--
ALTER TABLE `restaurant`
  MODIFY `rest_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=503;
--
-- AUTO_INCREMENT for table `restaurant_cuisine`
--
ALTER TABLE `restaurant_cuisine`
  MODIFY `rest_cuisine_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=109;
--
-- AUTO_INCREMENT for table `restaurant_item`
--
ALTER TABLE `restaurant_item`
  MODIFY `rest_item_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=197;
--
-- AUTO_INCREMENT for table `review`
--
ALTER TABLE `review`
  MODIFY `review_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=43;
--
-- AUTO_INCREMENT for table `suborder`
--
ALTER TABLE `suborder`
  MODIFY `so_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=19;
--
-- AUTO_INCREMENT for table `user_login`
--
ALTER TABLE `user_login`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=414;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `item`
--
ALTER TABLE `item`
  ADD CONSTRAINT `item_ibfk_1` FOREIGN KEY (`cuisine_id`) REFERENCES `cuisine` (`cuisine_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `ordr`
--
ALTER TABLE `ordr`
  ADD CONSTRAINT `ordr_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `user_login` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ordr_ibfk_3` FOREIGN KEY (`rest_id`) REFERENCES `restaurant` (`rest_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ordr_ibfk_4` FOREIGN KEY (`address_id`) REFERENCES `address` (`address_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `ordr_suborder`
--
ALTER TABLE `ordr_suborder`
  ADD CONSTRAINT `o_so_1` FOREIGN KEY (`ordr_id`) REFERENCES `ordr` (`ordr_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `o_so_2` FOREIGN KEY (`so_id`) REFERENCES `suborder` (`so_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `restaurant`
--
ALTER TABLE `restaurant`
  ADD CONSTRAINT `restaurant_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user_login` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `restaurant_cuisine`
--
ALTER TABLE `restaurant_cuisine`
  ADD CONSTRAINT `restaurant_cuisine_ibfk_1` FOREIGN KEY (`rest_id`) REFERENCES `restaurant` (`rest_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `restaurant_cuisine_ibfk_2` FOREIGN KEY (`cuisine_id`) REFERENCES `cuisine` (`cuisine_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `restaurant_item`
--
ALTER TABLE `restaurant_item`
  ADD CONSTRAINT `restaurant_item_ibfk_1` FOREIGN KEY (`rest_id`) REFERENCES `restaurant` (`rest_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `restaurant_item_ibfk_2` FOREIGN KEY (`item_id`) REFERENCES `item` (`item_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `review`
--
ALTER TABLE `review`
  ADD CONSTRAINT `review_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user_login` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `review_ibfk_2` FOREIGN KEY (`rest_id`) REFERENCES `restaurant` (`rest_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `suborder`
--
ALTER TABLE `suborder`
  ADD CONSTRAINT `suborder_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user_login` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `suborder_ibfk_2` FOREIGN KEY (`cuisine_id`) REFERENCES `cuisine` (`cuisine_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `suborder_ibfk_3` FOREIGN KEY (`item_id`) REFERENCES `item` (`item_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `suborder_ibfk_4` FOREIGN KEY (`rest_id`) REFERENCES `restaurant` (`rest_id`);

--
-- Constraints for table `user_login`
--
ALTER TABLE `user_login`
  ADD CONSTRAINT `user_login_ibfk_1` FOREIGN KEY (`address_id`) REFERENCES `address` (`address_id`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
