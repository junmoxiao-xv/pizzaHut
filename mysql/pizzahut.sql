/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80021
 Source Host           : localhost:3306
 Source Schema         : pizzahut

 Target Server Type    : MySQL
 Target Server Version : 80021
 File Encoding         : 65001

 Date: 30/05/2023 01:07:37
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tab_menu
-- ----------------------------
DROP TABLE IF EXISTS `tab_menu`;
CREATE TABLE `tab_menu`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `clissify` int(0) NULL DEFAULT NULL,
  `ingredients` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `intro` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `price` decimal(10, 2) NOT NULL,
  `image` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `clissify`(`clissify`) USING BTREE,
  CONSTRAINT `tab_menu_ibfk_1` FOREIGN KEY (`clissify`) REFERENCES `tab_type` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tab_menu
-- ----------------------------
INSERT INTO `tab_menu` VALUES (1, '苏丹王榴莲多多比萨', 1, '苏丹王榴莲果肉、芝士*', '甄品苏丹王榴莲，丰厚真实果肉，绵软细腻，高温烤制后奶香释放，纵享香醇浓郁，人气升级！', 78.00, 'd4a875b0b40540dda3c6c8e87c6d6832.jpg');
INSERT INTO `tab_menu` VALUES (2, '臻品法肝慕斯火腿比萨', 1, '法肝慕斯，法式火腿片，混合菌菇，青豆，樱桃番茄，芝士*', '丰腴顺滑的法肝慕斯，臻品豪享！采用法式工艺，细腻嫩滑的质地，佐以饱满柔嫩的火腿，口感层次丰富，纵情法式臻美！ *法肝慕斯主要原料为法式鸭肝', 78.00, '6665d88814d4461a94bb1a88916638a9.jpg');
INSERT INTO `tab_menu` VALUES (3, '新西兰羔羊腿肉比萨', 1, '孜香风味羊肉粒，洋葱，青椒，红甜椒，玉米，香辣粉，芝士*', '甄选新西兰羔羊腿肉，得天独厚的自然环境，成就优渥的香嫩口感，鲜美多汁。经高温烤制后，口感外酥里嫩，孜香浓郁！ *羊肉原料选用新西兰羊肉', 78.00, 'a0f31664ea164c7e92c8ea327caa1269.jpg');
INSERT INTO `tab_menu` VALUES (4, '金尊鲍鱼扇贝比萨', 1, '鲍鱼、扇贝、培根、樱桃番茄、菌菇、青豆、芝士*', '招财“鲍”富！甄选海珍鲍鱼，金灿灿南瓜鲍汁风味底酱，吉祥尊享，富贵有余', 78.00, '6006f9b7649242afa823c28f7b1506a9.jpg');
INSERT INTO `tab_menu` VALUES (5, '和牛芝香菌菇披萨', 1, '澳洲/新西兰和牛、菌菇、樱桃番茄、秋葵、芝士*', '优选澳洲/新西兰和牛*，肉质醇美丰腴，入口细嫩，菌菇添珍，牛势冲天！\r\n*和牛原料选用澳洲/新西兰和牛', 78.00, 'e8393b26d67b45e593d22fbf56fe1da0.jpg');
INSERT INTO `tab_menu` VALUES (6, '小龙虾酥香嫩鸡比萨', 1, '小龙虾、浓香鸡块、烟熏鸡肉丁、玉米、青椒、番茄辣椒酱、芝士*', '小龙虾酥香嫩鸡比萨十三香小龙虾搭配浓香鸡块，Q弹饱满，喷香肆溢！', 72.00, '7c4b1e5ab1be4bdd9a7e5f9249ea42af.jpg');
INSERT INTO `tab_menu` VALUES (7, '肋眼牛排比萨', 1, '肋眼牛排片、培根、红甜椒、玉米、芝麻菜、芝士*', '肋眼牛排*，丰腴香嫩，香烤多汁，缀以点睛芝麻菜，大快朵颐！', 72.00, 'e38d93b70ec4429cb22548d71edbdf9e.jpg');
INSERT INTO `tab_menu` VALUES (8, '意式猪颈肉丰享比萨', 1, '意式风味猪颈肉、意式香肠丁、洋葱、蘑菇、西兰花、樱桃番茄、芝士*', '甄选意式双料：意式猪颈肉、意式香肠丁。猪颈肉柔嫩多汁，脂香四溢的弹韧口感，搭配缤纷食蔬，尊享丰厚有料！', 59.00, 'e055c2786f474526a5d9979151d9325c.jpg');
INSERT INTO `tab_menu` VALUES (9, '照烧风味牛肉土豆比萨', 1, '照烧风味牛肉、培根、薯角、青豆、芝味酱、芝士*', '甄选牛肉，香浓蛋黄风味酱，美国进口酥香薯角，经典升级！', 59.00, 'd166bac5bfc54254b50bf761c06cfc43.jpg');
INSERT INTO `tab_menu` VALUES (10, '金沙咸蛋黄嫩鸡比萨', 1, '咸蛋黄风味酱、无骨嫩鸡块、培根、青豆、玉米粒、美乃滋、芝士*', '深受大众热爱的网红金沙咸蛋黄，口感浓醇绵密，沙润流香， 搭配达美乐人气小食美乐嫩汁鸡块，喷香多汁，酥嫩担当！', 59.00, 'cf9fa8ae968d4006b08baef7b9347b55.jpg');
INSERT INTO `tab_menu` VALUES (11, '豪华尊享比萨', 1, '意式香肠片、意式香肠丁、火腿、青椒、蘑菇、洋葱、芝士*', '意式香肠片、意式香肠丁、火腿搭配，丰盛享受！', 59.00, '28bec41bfbcb4e0996462d6c0c2e2965.jpg');
INSERT INTO `tab_menu` VALUES (12, '金枪鱼海鲜荟萃比萨', 1, '鱿鱼条、金枪鱼、虾仁、洋葱、樱桃番茄、青豆、美乃滋\"、芝士*', '\"丰嫩金枪鱼，饱满鱿鱼，搭配弹滑虾仁和甄选食蔬，丰盈料足，海鲜荟萃！', 59.00, '615180647426460dae54c116bdac39a6.jpg');
INSERT INTO `tab_menu` VALUES (13, '黑松露风味菌菇鸡肉比萨', 1, '烟熏鸡肉丁、培根、菌菇、青豆、芝士*', '黑松露风味酱融入杏鲍菇、白玉菇、烟熏鸡肉丁，鲜美嫩滑！', 59.00, '1900d0bb342a4ca8a6a22f14dfc58917.jpg');
INSERT INTO `tab_menu` VALUES (14, '德克萨斯风味烤肉似锦比萨', 1, '德克萨斯风味肉粒，洋葱，玉米，青豆，樱桃番茄，芝士*', '灵感来自德克萨斯特色烤肉，肉粒似锦，饱含浓郁烧烤风味，无肉不欢！融入香浓芝士，强强联合，口口满足！', 39.00, '6150f89444524f0791b9484e940ef3cb.jpg');
INSERT INTO `tab_menu` VALUES (15, '奥\"荔\"给嫩烤鸡腿比萨', 1, '奥尔良风味鸡腿肉、荔枝果肉、培根、青豆、蘑菇、芝士*', '奥尔良风味烤鸡腿肉，腿肉弹嫩紧实，入味多汁！外加晶莹荔枝，融合提鲜，奥“荔”给power up！', 39.00, 'c0484ccf75584049b68e934254158c5f.jpg');
INSERT INTO `tab_menu` VALUES (16, '浓香脆鸡菠萝比萨', 1, '浓香鸡块、樱桃番茄、菠萝 、芝士*', '嫩香多汁，人气产品！进口菠萝，甜酸相宜！', 49.00, '8f58b6876b05411b9edeb6d870d24380.jpg');
INSERT INTO `tab_menu` VALUES (17, '美国风情土豆培根比萨', 1, '培根、薯角、美乃滋、芝士*', '美国进口酥香薯角，甄选培根片，旗舰人气！', 46.00, '4c1da62adfc647a69bcb4bc77d41f2df.jpg');
INSERT INTO `tab_menu` VALUES (18, '夏威夷风情比萨', 1, '火腿、菠萝、芝士*', '进口菠萝和火腿片组合，全球人气', 46.00, '3e078295be56420ca8022ec9bd89cb55.jpg');
INSERT INTO `tab_menu` VALUES (19, '经典意式肉酱比萨', 1, '意式肉酱、意式香肠丁、樱桃番茄、欧芹碎、芝士*', '意式肉酱，经典香浓，意式香肠丁，粒粒饱满，酱汁交织肉香，别具意式风情。', 39.00, '790488f563384c60a4f6500c09263279.jpg');
INSERT INTO `tab_menu` VALUES (20, '澳洲/南美骰子牛肉比萨', 1, '黑蒜风味牛肉粒、培根、西兰花、洋葱、蜂蜜蛋黄酱、芝士*', '甄选谷饲牛肉原料，谷物饲料喂养，肉质口感脂香丰腴，香嫩多汁！饱满厚实骰子粒，匠心调配黑蒜风味腌制，大块朵颐，骰中“牛”运！\r\n配料：黑蒜风味牛肉粒、培根、西兰花、洋葱、蜂蜜蛋黄酱、芝士*', 69.00, '52db9ad0e4a841d196e02709fb463f03.jpg');
INSERT INTO `tab_menu` VALUES (21, '牛蒡大虾培根比萨', 1, '蒜香风味凤尾虾、培根、意式香肠丁、樱桃番茄、青豆、美乃滋、芝士*', '甄选有“东洋参”之誉的牛蒡，清香脆嫩，口感别致！香烤凤尾虾，整只大虾饱满鲜嫩！浓郁鲜香，考究有料！', 69.00, 'ea53b3c69e3443dd9aad6fe32b965b62.jpg');
INSERT INTO `tab_menu` VALUES (22, '果肉榴莲比萨', 1, '榴莲、芝士*', '泰国进口金枕榴莲，大块真实果肉，与浓醇芝士交织，甜香浓郁！', 69.00, '557cee67915d4f0180d4ace9c93777c5.jpg');
INSERT INTO `tab_menu` VALUES (23, '培根多多肉香粉松土豆比萨', 1, '培根、肉香粉松、意式香肠丁、薯角、青豆、美乃滋、芝士*', '培根加量！加量！网红肉香粉松，肉肉多多，喷香满溢，配上美国进口酥香土豆，重磅升级!', 69.00, '8bef21f6689b40b9a1f8ed3cbf216a61.jpg');
INSERT INTO `tab_menu` VALUES (24, '日式照烧滋烤鳗鱼比萨', 1, '蒲烧鳗鱼、秋葵、玉米、海苔、照烧风味酱、芝士*', '滑嫩鳗鱼（*鳗鱼中可能含有软刺，请小心食用），肉质丰腴，浓郁照烧酱汁，蒲烧滋烤，尽享日式“鳗”妙醇美!', 69.00, '8c4afd913db741eabdf9f6ca07f6e9b1.jpg');
INSERT INTO `tab_menu` VALUES (25, '经典大阪烧风味海陆比萨', 1, '扇贝、虾仁、木鱼花、培根、浓香鸡块、海苔芝麻、青豆、洋葱、大阪烧风味酱、芝士*', '经典大阪烧，滋香木鱼花，轻舞飞扬，畅享海陆盛宴！', 69.00, '9c888de442194e4891261aae0b990cae.jpg');
INSERT INTO `tab_menu` VALUES (26, '香甜双虾菠萝比萨', 1, '虾仁、菠萝、芝士*', '脆嫩烤虾仁，嫩滑虾仁，进口菠萝，香甜好滋味！', 69.00, 'efd9dcb90ce3427a9a59d612e661ba25.jpg');
INSERT INTO `tab_menu` VALUES (27, '西班牙风情香肠肉酱比萨', 1, '西班牙风味香肠、意式香肠片、樱桃番茄、青豆、芝士', '西班牙风味香肠，饱满弹嫩，融入意式经典肉酱，浓醇酱香萦绕鼻尖，鲜香肉汁缠绵唇齿。', 59.00, 'a1017fb165664e5daf203790f6741e5b.jpg');
INSERT INTO `tab_menu` VALUES (28, '多重浓芝比萨', 1, '巴马臣风味芝士、艾蒙塔比萨芝士和车达风味芝士丁3种再制干酪，芝士*。', '多重浓醇芝士，拉丝丰富，芝香肆溢！', 59.00, '121648f370784bfeb2286c2fbab3d809.jpg');
INSERT INTO `tab_menu` VALUES (29, '意式腊肠比萨', 1, '意式香肠片、芝士*', '进口芝士和意式腊肠组合，道地美味！', 59.00, '5920a20bf7d2471697e7e25431ed9430 .jpg');
INSERT INTO `tab_menu` VALUES (30, '韩式炸鸡滋香比萨', 1, '韩式风味炸鸡丁、洋葱、芝麻海苔粉、番茄辣椒酱、芝士*', '韩式炸鸡人气来袭！皮脆肉嫩，滋香四溢，搭配浓郁酱汁，回味无穷！', 39.00, '128bc1cbcff0458b935a5d8ba2f3bfe1.jpg');
INSERT INTO `tab_menu` VALUES (31, '什蔬荟萃比萨', 1, '玉米、蘑菇、青椒、樱桃番茄、西兰花、青豆', '多种蔬菜组合，缤纷荟萃，阳光心情！', 39.00, '0e21f517860f46f0b2a20d78ec742133.jpg');
INSERT INTO `tab_menu` VALUES (32, '可可布朗尼比萨', 1, '布朗尼蛋糕粒、可可粉、芝士*', '绵密松软布朗尼蛋糕粒，细滑可可粉，温热香甜，醇郁顺滑！', 28.00, '6b6c8181e41a4b5ab7ef231bd2b6273b.jpg');
INSERT INTO `tab_menu` VALUES (33, '缤纷水果比萨', 1, '黄桃、菠萝、椰果、蓝莓果味酱、芝士*', '大块黄桃果肉，搭配香甜椰果、菠萝，缤纷荟萃！', 28.00, 'd5cd7a8a535e424ea95b888f6cc3a02e.jpg');
INSERT INTO `tab_menu` VALUES (34, '肋眼整切嫩滋牛排', 2, '肋眼牛排140g、星形薯饼4个/31g、西兰花5个/17.2g、樱桃番茄2个/14g、黑椒蔬汁酱30g ＊如门店星形薯饼售罄，将替换成薯角36g\"', '\"臻选整切肋眼牛排，纹理紧致，入口丰腴香嫩、柔韧多汁，淋上醇香黑椒酱汁，悠享香嫩滋味，更有酥糯星星薯、西兰花和樱桃番茄加乘丰盈口感。', 49.00, '5109d9c252184cd7a061591b0d35748a.jpg');
INSERT INTO `tab_menu` VALUES (35, '鱿鱼籽海鲜意面', 3, '意大利面、鱿鱼籽菌菇酱、扇贝、青椒、红甜椒、洋葱', '鲜香鱿鱼籽与珍味菌菇熬制特色海鲜酱汁，甄选鲜美扇贝粒，海味荟萃，“意”味悠长！*可选弯管面', 29.00, 'efe41344598c4a34a7e873d1a3556a9b.jpg');
INSERT INTO `tab_menu` VALUES (36, '法式经典黑椒牛肉意面', 3, '意大利面、法式黄油黑椒牛肉、洋葱、红甜椒、青豆', '经典法式风情，醇香黄油融入香嫩多汁牛肉，浓郁入味，层次丰富，悠享法式滋味！', 29.00, '8695307a8dcf4c08857712728a76f556.jpg');
INSERT INTO `tab_menu` VALUES (37, '意大利风情肉酱面', 3, '意大利面、意式肉酱、西兰花、樱桃番茄', '香浓醇厚肉酱，浓浓铺于意面之上，鲜香顺滑，丝丝入味！', 29.00, '0e48639a2d2d4deea6dd48d6a26e4846.jpg');
INSERT INTO `tab_menu` VALUES (38, '罗勒培根意面', 3, '意大利面、奶油罗勒酱、樱桃番茄、培根、青豆', '鲜香培根，交融奶油罗勒酱，搭配樱桃番茄和青豆，经典美味！', 29.00, '185ee40e053142b88f56789f1e7aaae4.jpg');
INSERT INTO `tab_menu` VALUES (40, '咖喱牛腩焗饭', 3, '米饭、咖喱牛肉、马苏里拉芝士', '甄选牛腩与咖喱，肉香肆溢、酥香可口！', 29.00, 'cdbb5c21c9ca4290ac2d4461eea55509 .jpg');
INSERT INTO `tab_menu` VALUES (41, '香溢双肠荟萃炒饭', 3, '米饭，中式香肠片，图林根香肠片，炒蛋，青豆，胡萝卜，调味酱', '中式香肠片+图林根香肠片，双重肉感交融，领略缤纷丰盛，滋香满足！', 27.00, '492c3bbb7c684816877e1161506295da.jpg');
INSERT INTO `tab_menu` VALUES (42, '\r\n日式照烧鸡腿肉蛋炒饭', 3, '米饭，鸡腿肉，炒蛋，青豆，胡萝卜，调味酱', '日式照烧鸡腿肉，肉质弹嫩细腻，浓郁醇厚弥漫舌尖，尽享和风经典！', 27.00, '9b1f9b4cc71e4f979e803ee7d9e5c520.jpg');
INSERT INTO `tab_menu` VALUES (43, '南洋沙爹风味鸡肉串(3串)', 4, '沙爹风味鸡肉串', '经典南洋沙爹风味，鲜美醇厚！串串鸡腿肉柔嫩多汁，扎实满足口感，一串入魂！', 17.00, 'e9c359219eaa43499e2b9f3b644e49e3.jpg');
INSERT INTO `tab_menu` VALUES (44, '秘制飘香半鸡', 4, '嫩汁半鸡300g（半只、含骨架）、星形薯饼4个、西兰花5个、樱桃番茄2个 \"', '\"8味秘制香料，12小时用心腌制，先蒸后烤，锁住饱满肉汁。外皮油润酥香，内里细嫩多汁，尽情手撕，口齿留香！更有酥糯星星薯、西兰花等，加乘丰盈口感！', 38.00, '4a00d79b6337431fb4a93fe8ef6a6b51.jpg');
INSERT INTO `tab_menu` VALUES (45, '土耳其风味燃情烤鸡腿(2个)', 4, '土耳其烧烤风味蝴蝶腿', '特色香料汇集成独特经典的土耳其风味，地道经典，浓郁嫩汁，燃情迸发！', 26.00, '14d4520616fa4c8da4746a61d7c63bf1.jpg');
INSERT INTO `tab_menu` VALUES (46, '日式滋烤嫩汁鸡腿(2个)', 4, '日式炭烤风味蝴蝶腿', '\"匠心秘制酱料腌制，复刻日式经典，滋香炙烤，鸡腿柔嫩多汁，肉香四溢！', 26.00, 'ed9ce1fd7431487fb6d919bfac165e6c.jpg');
INSERT INTO `tab_menu` VALUES (47, '海陆拼盘', 4, '热狗面包卷2个、美乐嫩汁鸡块半份、酥香嫩鱼块1份、酥糯星星薯1份，滋味丰盛！', '热狗面包卷2个、美乐嫩汁鸡块半份、酥香嫩鱼块1份、酥糯星星薯1份，滋味丰盛！', 46.00, '22ecba9f251343c1bdbde5655e3b7436.jpg');
INSERT INTO `tab_menu` VALUES (48, '烤翅拼盘(8个)', 4, '粤式香烤风味烤翅1对+BBQ烧烤风味烤翅1对+蜜汁风味烤翅1对+奥尔良风味烤翅1对', '奥尔良风味、蜜汁风味，BBQ烧烤风味搭配全新粤式香烤风味烤翅，香嫩多汁，一盘丰享四味！', 46.00, '4d1647a4dbea4df9a4899ccb3787e98f.jpg');
INSERT INTO `tab_menu` VALUES (50, '粤式香烤风味烤翅(4个)', 4, '粤式香烤风味烤翅', '饱满鸡翅，香嫩多汁，一口咬下去，久久回味！', 26.00, '84aef8c3a7214e35ae1eac56ecca15d3.jpg');
INSERT INTO `tab_menu` VALUES (51, '单份烤翅(BBQ烧烤风味)(4个)', 4, 'BBQ烧烤风味烤翅', '饱满鸡翅，香嫩多汁，一口咬下去，久久回味！', 26.00, '3b623e9f39da4b7c952fa70de5fb220a.jpg');
INSERT INTO `tab_menu` VALUES (52, '单份烤翅(奥尔良风味)(4个)', 4, '奥尔良风味鸡翅', '饱满鸡翅，香嫩多汁，一口咬下去，久久回味！', 26.00, 'f9ea498057b949559ac7c5085699fcc3.jpg');
INSERT INTO `tab_menu` VALUES (53, '美乐嫩汁鸡块', 4, '鸡块', '无骨鸡胸肉，烤制后酥嫩多汁，满口喷香！搭配番茄酱更美味哦。', 22.00, '92bf5318f8f24a2da83bded915a6b57d.jpg');
INSERT INTO `tab_menu` VALUES (54, '单份烤翅(蜜汁)(4个)', 4, '蜜汁鸡翅', '饱满鸡翅，香嫩多汁，一口咬下去，久久回味！', 26.00, 'edba4815f3a94a2ca52f84538481a626.jpg');
INSERT INTO `tab_menu` VALUES (55, '孜然香烤羊肉串(3串)', 4, '孜然风味羊肉串', '香烤羊肉，孜然入味，回味浓郁！', 18.00, 'dddd4f758cee480cb3d370b5942d2f6e.jpg');
INSERT INTO `tab_menu` VALUES (56, '(孜然)滋犇犇烤牛肉串(3串)', 4, '孜然风味牛肉串', '滋烤牛肉，肉质嫩滑，口感带劲！', 18.00, '5b55a994f0154ae487c166ad9f2ca91f.jpg');
INSERT INTO `tab_menu` VALUES (57, '喷香肉肉烤肠串(3串)', 4, '原味德式香肠串', '饱满烤肠，醇香柔嫩，肉感十足！', 17.00, '6b44ff1c1da2489e9fc28fe1272618cc.jpg');
INSERT INTO `tab_menu` VALUES (58, '蛋香鸡肉卷(4个)', 4, '烟熏鸡肉丁、香浓蛋黄风味酱、青豆、面饼', '金黄酥脆外皮，包裹浓浓嫩滑蛋香酱，烟熏鸡肉丁和青豆更添丰盛口感！', 18.00, '20122a420bbf4530bd1b4c7ee9f1a3d9.jpg');
INSERT INTO `tab_menu` VALUES (59, '\r\n脆嫩烤虾仁(8个)', 4, '虾仁', '金黄外表，喷香酥脆，被包裹的虾仁饱满嫩滑。', 18.00, '1886f65e80134e31ac337fc0a98bc5f1.png');
INSERT INTO `tab_menu` VALUES (60, '酥嫩狭鳕鱼粒(12个)', 4, '狭鳕鱼粒', '狭鳕鱼，酥嫩喷香，美味可口！', 18.00, 'f2818e8c38c7445189c86bc6ab983cc6.jpg');
INSERT INTO `tab_menu` VALUES (61, '酥香嫩鱼块(10块)', 4, '鱼块', '嫩滑的无骨鱼块，颗粒饱满，口口酥香！搭配番茄酱更美味哦。', 16.00, '8c57b1896b0848f19e9aa6fbd24c47f7.png');
INSERT INTO `tab_menu` VALUES (62, '\r\n热狗面包卷', 4, '香肠、面团', '金黄松软的面包卷裹着Q弹热狗，口口满足。搭配番茄酱更美味哦。', 16.00, '48b3215ffbf34951973d3cf532ddc16c.png');
INSERT INTO `tab_menu` VALUES (63, '阳光蔬菜色拉', 4, '阳光蔬菜沙拉', '品质芝麻菜、罗莎绿、罗莎红、紫甘蓝、樱桃番茄、胡萝卜搭配，阳光缤纷！', 14.00, '11475b3708ec4b1d91b88f6f00df4077.jpg');
INSERT INTO `tab_menu` VALUES (64, '酥糯星星薯(11个)', 4, '星形薯饼', '奇趣闪星星，外酥内糯！', 14.00, '95da8c434e794035a9070c35de46ccd9.jpg');
INSERT INTO `tab_menu` VALUES (65, '洋葱黄金圈(10个)', 4, '洋葱圈', '西式经典！金黄酥脆，浓郁鲜香，圈住你的小心心！', 13.00, '6f6b95e0fafe40999d3fa3b32b493680.jpg');
INSERT INTO `tab_menu` VALUES (66, '黄金薯角', 4, '薯角', '黄金薯角，软糯甜香，我心所“薯”！', 12.00, '422fdd68f2644a5b8314dbdf8f9acd0f.png');
INSERT INTO `tab_menu` VALUES (67, '香蒜松软方方包(蜂蜜蛋黄酱)', 4, '面团、蒜味调料粉', '手工现烤的方方包，蒜香四溢，蘸取蜂蜜蛋黄酱，酥软松香。', 13.00, '5b4286fd0466460d973e589941cb8bb2.jpg');
INSERT INTO `tab_menu` VALUES (68, '香蒜香烤大面包(蜂蜜蛋黄酱)', 4, '面团、蒜味调料粉', '外酥里嫩，浓香弥漫，满口幸福感', 15.00, '5e4099b92ffc4da7803f90d3016e8c80.jpg');
INSERT INTO `tab_menu` VALUES (69, '起司香烤大面包(蜂蜜蛋黄酱)', 4, '面团、马苏里拉芝士、车达风味芝士、蒜味调料粉', '松软面包和醇郁的芝士交融，香气弥漫。', 17.00, '6ce29521529f4bdf91d6fff2868044e9.jpg');
INSERT INTO `tab_menu` VALUES (70, '芝士火腿满\"溢\"包(蜂蜜蛋黄酱)', 4, '面团、马苏里拉芝士、车达风味芝士、火腿、蒜味调料粉', '火腿与芝士的浓香从松软面包中溢出，香气在唇齿间迸发', 19.00, '8523fe6c98824719b214a7d53b4e407a.jpg');
INSERT INTO `tab_menu` VALUES (71, '巧克力熔浆蛋糕', 5, '巧克力熔浆蛋糕', '丝滑巧克力浆，包裹于松软蛋糕中，甜蜜心尖！', 17.00, '0b037624a7064494ba1d25fa3bd379c9.png');
INSERT INTO `tab_menu` VALUES (72, '绵香榴莲芝士派(4个)', 5, '面团、榴莲、奶酪酱、肉桂味糖粉', '浓芝榴莲包裹于香软派皮，新鲜现烤，“榴莲”不放手！', 13.00, '3ac6ea4b902d496ca39e19f5372b1810.jpg');
INSERT INTO `tab_menu` VALUES (73, '香甜菠萝芝士派(4个)', 5, '面团、菠萝、奶酪酱、肉桂味糖粉', '甜酸菠萝交织浓香芝士，松软外皮，现烤好滋味！', 13.00, '18362d93719a49ec9e97f4809d80949a.jpg');
INSERT INTO `tab_menu` VALUES (74, '招牌蛋挞(2个)', 5, '蛋挞', '松脆的酥皮，加上蛋香浓郁的柔软内心，幸福满溢。', 10.00, '5304e72bdf584dcebf8013708e837a7d.jpg');
INSERT INTO `tab_menu` VALUES (75, '杨桃橄榄椰青冻饮(冷)', 6, '水、杨桃橄榄果汁饮料、椰青冻', '“星星果”杨桃甜酸多汁，橄榄清爽回甘，顺滑椰青冻点睛丰富口感', 13.00, '3ba5197c94374ef482ff313983975056.jpg');
INSERT INTO `tab_menu` VALUES (76, '\r\n百香果芒果饮(冷)', 6, '水、百香芒果果酱、百香果酱', '果味交织，果香馥郁，清新畅爽！', 13.00, '87dbd5e80b8f4dee8773b84be0c866bd.jpg');
INSERT INTO `tab_menu` VALUES (77, '生椰玫珑瓜沁饮(冷)', 6, '水、玫珑蜜瓜果汁饮料、生椰饮品', '绵软柔滑的玫珑瓜，醇厚浓郁的生椰，双重甜蜜交织，果香纯粹余韵悠长', 13.00, '0b106e09dc8445fc85ec864c72590af3.jpg');
INSERT INTO `tab_menu` VALUES (78, '柠香油柑椰青冻饮(冷)', 6, '水、油柑果酱、椰青冻', '回甘清甜的网红油柑混合清新柠檬汁，融入顺滑椰青冻，清爽生津，畅享轻盈。', 13.00, '53a47feaf3754d7fb5e055ebc6b35846.jpg');
INSERT INTO `tab_menu` VALUES (79, '奶香南瓜培根浓汤', 7, '南瓜奶油培根汤', '软糯香甜的南瓜，交融香嫩味美的培根，奶香浓郁，浓汤包裹多重食材，鲜美浓稠！', 18.00, '40ef694215e6451abd84e8b15d80690c.jpg');
INSERT INTO `tab_menu` VALUES (80, '经典牛肉罗宋汤', 7, '蔬菜牛肉汤', '经典人气罗宋汤，更添酥嫩牛肉，酸甜鲜美！', 18.00, '0405ebbafbd14f17bb57708e21feafd8.jpg');
INSERT INTO `tab_menu` VALUES (81, '奶油蘑菇汤', 7, '奶油蘑菇汤', '甄选奶油和蘑菇，浓醇风味，奶香肆溢。', 16.00, '4277f410b6b54d72b1873ec6be0d1cba.png');
INSERT INTO `tab_menu` VALUES (82, '京味烤鸭比萨', 1, '烤鸭胸片、红甜椒、黄瓜丁、京葱丝\"、芝士*', '\"片片鸭肉脂香紧嫩，经典京葱丝、黄瓜丁加乘口感，醇厚提鲜烤鸭调味酱，演绎京味名膳。', 59.00, 'b8ab6c05d85d42b2859a6a2085b0ed87.jpg');

-- ----------------------------
-- Table structure for tab_type
-- ----------------------------
DROP TABLE IF EXISTS `tab_type`;
CREATE TABLE `tab_type`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tab_type
-- ----------------------------
INSERT INTO `tab_type` VALUES (1, '比萨');
INSERT INTO `tab_type` VALUES (2, '牛排');
INSERT INTO `tab_type` VALUES (3, '主食');
INSERT INTO `tab_type` VALUES (4, '小食');
INSERT INTO `tab_type` VALUES (5, '甜品');
INSERT INTO `tab_type` VALUES (6, '饮料');
INSERT INTO `tab_type` VALUES (7, '汤类');

SET FOREIGN_KEY_CHECKS = 1;
