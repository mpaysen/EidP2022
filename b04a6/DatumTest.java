/**
 * @author mpayse2s
 */
public class DatumTest {

    public static boolean istSchaltjahrCheck(int j, boolean erw) {
      boolean erg = Datum.istSchaltjahr(j);
      if (erg != erw) {
        // Sie koennen das Format der Ausgabe nach Geschmack aendern
        System.out.println("FEHLER: istSchaltjahr(" + j + ")==" + erg + " statt " + erw);
      }
      return erg == erw;
    }

  public static boolean istSchaltjahrTest() {
    return 
    istSchaltjahrCheck(1400, true )
    && istSchaltjahrCheck(1401, false )
    && istSchaltjahrCheck(1402, false )
    && istSchaltjahrCheck(1403, false )
    && istSchaltjahrCheck(1404, true )
    && istSchaltjahrCheck(1405, false )
    && istSchaltjahrCheck(1406, false )
    && istSchaltjahrCheck(1407, false )
    && istSchaltjahrCheck(1408, true )
    && istSchaltjahrCheck(1409, false )
    && istSchaltjahrCheck(1410, false )
    && istSchaltjahrCheck(1411, false )
    && istSchaltjahrCheck(1412, true )
    && istSchaltjahrCheck(1413, false )
    && istSchaltjahrCheck(1414, false )
    && istSchaltjahrCheck(1415, false )
    && istSchaltjahrCheck(1416, true )
    && istSchaltjahrCheck(1417, false )
    && istSchaltjahrCheck(1418, false )
    && istSchaltjahrCheck(1419, false )
    && istSchaltjahrCheck(1420, true )
    && istSchaltjahrCheck(1421, false )
    && istSchaltjahrCheck(1422, false )
    && istSchaltjahrCheck(1423, false )
    && istSchaltjahrCheck(1424, true )
    && istSchaltjahrCheck(1425, false )
    && istSchaltjahrCheck(1426, false )
    && istSchaltjahrCheck(1427, false )
    && istSchaltjahrCheck(1428, true )
    && istSchaltjahrCheck(1429, false )
    && istSchaltjahrCheck(1430, false )
    && istSchaltjahrCheck(1431, false )
    && istSchaltjahrCheck(1432, true )
    && istSchaltjahrCheck(1433, false )
    && istSchaltjahrCheck(1434, false )
    && istSchaltjahrCheck(1435, false )
    && istSchaltjahrCheck(1436, true )
    && istSchaltjahrCheck(1437, false )
    && istSchaltjahrCheck(1438, false )
    && istSchaltjahrCheck(1439, false )
    && istSchaltjahrCheck(1440, true )
    && istSchaltjahrCheck(1441, false )
    && istSchaltjahrCheck(1442, false )
    && istSchaltjahrCheck(1443, false )
    && istSchaltjahrCheck(1444, true )
    && istSchaltjahrCheck(1445, false )
    && istSchaltjahrCheck(1446, false )
    && istSchaltjahrCheck(1447, false )
    && istSchaltjahrCheck(1448, true )
    && istSchaltjahrCheck(1449, false )
    && istSchaltjahrCheck(1450, false )
    && istSchaltjahrCheck(1451, false )
    && istSchaltjahrCheck(1452, true )
    && istSchaltjahrCheck(1453, false )
    && istSchaltjahrCheck(1454, false )
    && istSchaltjahrCheck(1455, false )
    && istSchaltjahrCheck(1456, true )
    && istSchaltjahrCheck(1457, false )
    && istSchaltjahrCheck(1458, false )
    && istSchaltjahrCheck(1459, false )
    && istSchaltjahrCheck(1460, true )
    && istSchaltjahrCheck(1461, false )
    && istSchaltjahrCheck(1462, false )
    && istSchaltjahrCheck(1463, false )
    && istSchaltjahrCheck(1464, true )
    && istSchaltjahrCheck(1465, false )
    && istSchaltjahrCheck(1466, false )
    && istSchaltjahrCheck(1467, false )
    && istSchaltjahrCheck(1468, true )
    && istSchaltjahrCheck(1469, false )
    && istSchaltjahrCheck(1470, false )
    && istSchaltjahrCheck(1471, false )
    && istSchaltjahrCheck(1472, true )
    && istSchaltjahrCheck(1473, false )
    && istSchaltjahrCheck(1474, false )
    && istSchaltjahrCheck(1475, false )
    && istSchaltjahrCheck(1476, true )
    && istSchaltjahrCheck(1477, false )
    && istSchaltjahrCheck(1478, false )
    && istSchaltjahrCheck(1479, false )
    && istSchaltjahrCheck(1480, true )
    && istSchaltjahrCheck(1481, false )
    && istSchaltjahrCheck(1482, false )
    && istSchaltjahrCheck(1483, false )
    && istSchaltjahrCheck(1484, true )
    && istSchaltjahrCheck(1485, false )
    && istSchaltjahrCheck(1486, false )
    && istSchaltjahrCheck(1487, false )
    && istSchaltjahrCheck(1488, true )
    && istSchaltjahrCheck(1489, false )
    && istSchaltjahrCheck(1490, false )
    && istSchaltjahrCheck(1491, false )
    && istSchaltjahrCheck(1492, true )
    && istSchaltjahrCheck(1493, false )
    && istSchaltjahrCheck(1494, false )
    && istSchaltjahrCheck(1495, false )
    && istSchaltjahrCheck(1496, true )
    && istSchaltjahrCheck(1497, false )
    && istSchaltjahrCheck(1498, false )
    && istSchaltjahrCheck(1499, false )
    && istSchaltjahrCheck(1500, true )
    && istSchaltjahrCheck(1501, false )
    && istSchaltjahrCheck(1502, false )
    && istSchaltjahrCheck(1503, false )
    && istSchaltjahrCheck(1504, true )
    && istSchaltjahrCheck(1505, false )
    && istSchaltjahrCheck(1506, false )
    && istSchaltjahrCheck(1507, false )
    && istSchaltjahrCheck(1508, true )
    && istSchaltjahrCheck(1509, false )
    && istSchaltjahrCheck(1510, false )
    && istSchaltjahrCheck(1511, false )
    && istSchaltjahrCheck(1512, true )
    && istSchaltjahrCheck(1513, false )
    && istSchaltjahrCheck(1514, false )
    && istSchaltjahrCheck(1515, false )
    && istSchaltjahrCheck(1516, true )
    && istSchaltjahrCheck(1517, false )
    && istSchaltjahrCheck(1518, false )
    && istSchaltjahrCheck(1519, false )
    && istSchaltjahrCheck(1520, true )
    && istSchaltjahrCheck(1521, false )
    && istSchaltjahrCheck(1522, false )
    && istSchaltjahrCheck(1523, false )
    && istSchaltjahrCheck(1524, true )
    && istSchaltjahrCheck(1525, false )
    && istSchaltjahrCheck(1526, false )
    && istSchaltjahrCheck(1527, false )
    && istSchaltjahrCheck(1528, true )
    && istSchaltjahrCheck(1529, false )
    && istSchaltjahrCheck(1530, false )
    && istSchaltjahrCheck(1531, false )
    && istSchaltjahrCheck(1532, true )
    && istSchaltjahrCheck(1533, false )
    && istSchaltjahrCheck(1534, false )
    && istSchaltjahrCheck(1535, false )
    && istSchaltjahrCheck(1536, true )
    && istSchaltjahrCheck(1537, false )
    && istSchaltjahrCheck(1538, false )
    && istSchaltjahrCheck(1539, false )
    && istSchaltjahrCheck(1540, true )
    && istSchaltjahrCheck(1541, false )
    && istSchaltjahrCheck(1542, false )
    && istSchaltjahrCheck(1543, false )
    && istSchaltjahrCheck(1544, true )
    && istSchaltjahrCheck(1545, false )
    && istSchaltjahrCheck(1546, false )
    && istSchaltjahrCheck(1547, false )
    && istSchaltjahrCheck(1548, true )
    && istSchaltjahrCheck(1549, false )
    && istSchaltjahrCheck(1550, false )
    && istSchaltjahrCheck(1551, false )
    && istSchaltjahrCheck(1552, true )
    && istSchaltjahrCheck(1553, false )
    && istSchaltjahrCheck(1554, false )
    && istSchaltjahrCheck(1555, false )
    && istSchaltjahrCheck(1556, true )
    && istSchaltjahrCheck(1557, false )
    && istSchaltjahrCheck(1558, false )
    && istSchaltjahrCheck(1559, false )
    && istSchaltjahrCheck(1560, true )
    && istSchaltjahrCheck(1561, false )
    && istSchaltjahrCheck(1562, false )
    && istSchaltjahrCheck(1563, false )
    && istSchaltjahrCheck(1564, true )
    && istSchaltjahrCheck(1565, false )
    && istSchaltjahrCheck(1566, false )
    && istSchaltjahrCheck(1567, false )
    && istSchaltjahrCheck(1568, true )
    && istSchaltjahrCheck(1569, false )
    && istSchaltjahrCheck(1570, false )
    && istSchaltjahrCheck(1571, false )
    && istSchaltjahrCheck(1572, true )
    && istSchaltjahrCheck(1573, false )
    && istSchaltjahrCheck(1574, false )
    && istSchaltjahrCheck(1575, false )
    && istSchaltjahrCheck(1576, true )
    && istSchaltjahrCheck(1577, false )
    && istSchaltjahrCheck(1578, false )
    && istSchaltjahrCheck(1579, false )
    && istSchaltjahrCheck(1580, true )
    && istSchaltjahrCheck(1581, false )
    && istSchaltjahrCheck(1582, false )
    && istSchaltjahrCheck(1583, false )
    && istSchaltjahrCheck(1584, true )
    && istSchaltjahrCheck(1585, false )
    && istSchaltjahrCheck(1586, false )
    && istSchaltjahrCheck(1587, false )
    && istSchaltjahrCheck(1588, true )
    && istSchaltjahrCheck(1589, false )
    && istSchaltjahrCheck(1590, false )
    && istSchaltjahrCheck(1591, false )
    && istSchaltjahrCheck(1592, true )
    && istSchaltjahrCheck(1593, false )
    && istSchaltjahrCheck(1594, false )
    && istSchaltjahrCheck(1595, false )
    && istSchaltjahrCheck(1596, true )
    && istSchaltjahrCheck(1597, false )
    && istSchaltjahrCheck(1598, false )
    && istSchaltjahrCheck(1599, false )
    && istSchaltjahrCheck(1600, true )
    && istSchaltjahrCheck(1601, false )
    && istSchaltjahrCheck(1602, false )
    && istSchaltjahrCheck(1603, false )
    && istSchaltjahrCheck(1604, true )
    && istSchaltjahrCheck(1605, false )
    && istSchaltjahrCheck(1606, false )
    && istSchaltjahrCheck(1607, false )
    && istSchaltjahrCheck(1608, true )
    && istSchaltjahrCheck(1609, false )
    && istSchaltjahrCheck(1610, false )
    && istSchaltjahrCheck(1611, false )
    && istSchaltjahrCheck(1612, true )
    && istSchaltjahrCheck(1613, false )
    && istSchaltjahrCheck(1614, false )
    && istSchaltjahrCheck(1615, false )
    && istSchaltjahrCheck(1616, true )
    && istSchaltjahrCheck(1617, false )
    && istSchaltjahrCheck(1618, false )
    && istSchaltjahrCheck(1619, false )
    && istSchaltjahrCheck(1620, true )
    && istSchaltjahrCheck(1621, false )
    && istSchaltjahrCheck(1622, false )
    && istSchaltjahrCheck(1623, false )
    && istSchaltjahrCheck(1624, true )
    && istSchaltjahrCheck(1625, false )
    && istSchaltjahrCheck(1626, false )
    && istSchaltjahrCheck(1627, false )
    && istSchaltjahrCheck(1628, true )
    && istSchaltjahrCheck(1629, false )
    && istSchaltjahrCheck(1630, false )
    && istSchaltjahrCheck(1631, false )
    && istSchaltjahrCheck(1632, true )
    && istSchaltjahrCheck(1633, false )
    && istSchaltjahrCheck(1634, false )
    && istSchaltjahrCheck(1635, false )
    && istSchaltjahrCheck(1636, true )
    && istSchaltjahrCheck(1637, false )
    && istSchaltjahrCheck(1638, false )
    && istSchaltjahrCheck(1639, false )
    && istSchaltjahrCheck(1640, true )
    && istSchaltjahrCheck(1641, false )
    && istSchaltjahrCheck(1642, false )
    && istSchaltjahrCheck(1643, false )
    && istSchaltjahrCheck(1644, true )
    && istSchaltjahrCheck(1645, false )
    && istSchaltjahrCheck(1646, false )
    && istSchaltjahrCheck(1647, false )
    && istSchaltjahrCheck(1648, true )
    && istSchaltjahrCheck(1649, false )
    && istSchaltjahrCheck(1650, false )
    && istSchaltjahrCheck(1651, false )
    && istSchaltjahrCheck(1652, true )
    && istSchaltjahrCheck(1653, false )
    && istSchaltjahrCheck(1654, false )
    && istSchaltjahrCheck(1655, false )
    && istSchaltjahrCheck(1656, true )
    && istSchaltjahrCheck(1657, false )
    && istSchaltjahrCheck(1658, false )
    && istSchaltjahrCheck(1659, false )
    && istSchaltjahrCheck(1660, true )
    && istSchaltjahrCheck(1661, false )
    && istSchaltjahrCheck(1662, false )
    && istSchaltjahrCheck(1663, false )
    && istSchaltjahrCheck(1664, true )
    && istSchaltjahrCheck(1665, false )
    && istSchaltjahrCheck(1666, false )
    && istSchaltjahrCheck(1667, false )
    && istSchaltjahrCheck(1668, true )
    && istSchaltjahrCheck(1669, false )
    && istSchaltjahrCheck(1670, false )
    && istSchaltjahrCheck(1671, false )
    && istSchaltjahrCheck(1672, true )
    && istSchaltjahrCheck(1673, false )
    && istSchaltjahrCheck(1674, false )
    && istSchaltjahrCheck(1675, false )
    && istSchaltjahrCheck(1676, true )
    && istSchaltjahrCheck(1677, false )
    && istSchaltjahrCheck(1678, false )
    && istSchaltjahrCheck(1679, false )
    && istSchaltjahrCheck(1680, true )
    && istSchaltjahrCheck(1681, false )
    && istSchaltjahrCheck(1682, false )
    && istSchaltjahrCheck(1683, false )
    && istSchaltjahrCheck(1684, true )
    && istSchaltjahrCheck(1685, false )
    && istSchaltjahrCheck(1686, false )
    && istSchaltjahrCheck(1687, false )
    && istSchaltjahrCheck(1688, true )
    && istSchaltjahrCheck(1689, false )
    && istSchaltjahrCheck(1690, false )
    && istSchaltjahrCheck(1691, false )
    && istSchaltjahrCheck(1692, true )
    && istSchaltjahrCheck(1693, false )
    && istSchaltjahrCheck(1694, false )
    && istSchaltjahrCheck(1695, false )
    && istSchaltjahrCheck(1696, true )
    && istSchaltjahrCheck(1697, false )
    && istSchaltjahrCheck(1698, false )
    && istSchaltjahrCheck(1699, false )
    && istSchaltjahrCheck(1700, false )
    && istSchaltjahrCheck(1701, false )
    && istSchaltjahrCheck(1702, false )
    && istSchaltjahrCheck(1703, false )
    && istSchaltjahrCheck(1704, true )
    && istSchaltjahrCheck(1705, false )
    && istSchaltjahrCheck(1706, false )
    && istSchaltjahrCheck(1707, false )
    && istSchaltjahrCheck(1708, true )
    && istSchaltjahrCheck(1709, false )
    && istSchaltjahrCheck(1710, false )
    && istSchaltjahrCheck(1711, false )
    && istSchaltjahrCheck(1712, true )
    && istSchaltjahrCheck(1713, false )
    && istSchaltjahrCheck(1714, false )
    && istSchaltjahrCheck(1715, false )
    && istSchaltjahrCheck(1716, true )
    && istSchaltjahrCheck(1717, false )
    && istSchaltjahrCheck(1718, false )
    && istSchaltjahrCheck(1719, false )
    && istSchaltjahrCheck(1720, true )
    && istSchaltjahrCheck(1721, false )
    && istSchaltjahrCheck(1722, false )
    && istSchaltjahrCheck(1723, false )
    && istSchaltjahrCheck(1724, true )
    && istSchaltjahrCheck(1725, false )
    && istSchaltjahrCheck(1726, false )
    && istSchaltjahrCheck(1727, false )
    && istSchaltjahrCheck(1728, true )
    && istSchaltjahrCheck(1729, false )
    && istSchaltjahrCheck(1730, false )
    && istSchaltjahrCheck(1731, false )
    && istSchaltjahrCheck(1732, true )
    && istSchaltjahrCheck(1733, false )
    && istSchaltjahrCheck(1734, false )
    && istSchaltjahrCheck(1735, false )
    && istSchaltjahrCheck(1736, true )
    && istSchaltjahrCheck(1737, false )
    && istSchaltjahrCheck(1738, false )
    && istSchaltjahrCheck(1739, false )
    && istSchaltjahrCheck(1740, true )
    && istSchaltjahrCheck(1741, false )
    && istSchaltjahrCheck(1742, false )
    && istSchaltjahrCheck(1743, false )
    && istSchaltjahrCheck(1744, true )
    && istSchaltjahrCheck(1745, false )
    && istSchaltjahrCheck(1746, false )
    && istSchaltjahrCheck(1747, false )
    && istSchaltjahrCheck(1748, true )
    && istSchaltjahrCheck(1749, false )
    && istSchaltjahrCheck(1750, false )
    && istSchaltjahrCheck(1751, false )
    && istSchaltjahrCheck(1752, true )
    && istSchaltjahrCheck(1753, false )
    && istSchaltjahrCheck(1754, false )
    && istSchaltjahrCheck(1755, false )
    && istSchaltjahrCheck(1756, true )
    && istSchaltjahrCheck(1757, false )
    && istSchaltjahrCheck(1758, false )
    && istSchaltjahrCheck(1759, false )
    && istSchaltjahrCheck(1760, true )
    && istSchaltjahrCheck(1761, false )
    && istSchaltjahrCheck(1762, false )
    && istSchaltjahrCheck(1763, false )
    && istSchaltjahrCheck(1764, true )
    && istSchaltjahrCheck(1765, false )
    && istSchaltjahrCheck(1766, false )
    && istSchaltjahrCheck(1767, false )
    && istSchaltjahrCheck(1768, true )
    && istSchaltjahrCheck(1769, false )
    && istSchaltjahrCheck(1770, false )
    && istSchaltjahrCheck(1771, false )
    && istSchaltjahrCheck(1772, true )
    && istSchaltjahrCheck(1773, false )
    && istSchaltjahrCheck(1774, false )
    && istSchaltjahrCheck(1775, false )
    && istSchaltjahrCheck(1776, true )
    && istSchaltjahrCheck(1777, false )
    && istSchaltjahrCheck(1778, false )
    && istSchaltjahrCheck(1779, false )
    && istSchaltjahrCheck(1780, true )
    && istSchaltjahrCheck(1781, false )
    && istSchaltjahrCheck(1782, false )
    && istSchaltjahrCheck(1783, false )
    && istSchaltjahrCheck(1784, true )
    && istSchaltjahrCheck(1785, false )
    && istSchaltjahrCheck(1786, false )
    && istSchaltjahrCheck(1787, false )
    && istSchaltjahrCheck(1788, true )
    && istSchaltjahrCheck(1789, false )
    && istSchaltjahrCheck(1790, false )
    && istSchaltjahrCheck(1791, false )
    && istSchaltjahrCheck(1792, true )
    && istSchaltjahrCheck(1793, false )
    && istSchaltjahrCheck(1794, false )
    && istSchaltjahrCheck(1795, false )
    && istSchaltjahrCheck(1796, true )
    && istSchaltjahrCheck(1797, false )
    && istSchaltjahrCheck(1798, false )
    && istSchaltjahrCheck(1799, false )
    && istSchaltjahrCheck(1800, false )
    && istSchaltjahrCheck(1801, false )
    && istSchaltjahrCheck(1802, false )
    && istSchaltjahrCheck(1803, false )
    && istSchaltjahrCheck(1804, true )
    && istSchaltjahrCheck(1805, false )
    && istSchaltjahrCheck(1806, false )
    && istSchaltjahrCheck(1807, false )
    && istSchaltjahrCheck(1808, true )
    && istSchaltjahrCheck(1809, false )
    && istSchaltjahrCheck(1810, false )
    && istSchaltjahrCheck(1811, false )
    && istSchaltjahrCheck(1812, true )
    && istSchaltjahrCheck(1813, false )
    && istSchaltjahrCheck(1814, false )
    && istSchaltjahrCheck(1815, false )
    && istSchaltjahrCheck(1816, true )
    && istSchaltjahrCheck(1817, false )
    && istSchaltjahrCheck(1818, false )
    && istSchaltjahrCheck(1819, false )
    && istSchaltjahrCheck(1820, true )
    && istSchaltjahrCheck(1821, false )
    && istSchaltjahrCheck(1822, false )
    && istSchaltjahrCheck(1823, false )
    && istSchaltjahrCheck(1824, true )
    && istSchaltjahrCheck(1825, false )
    && istSchaltjahrCheck(1826, false )
    && istSchaltjahrCheck(1827, false )
    && istSchaltjahrCheck(1828, true )
    && istSchaltjahrCheck(1829, false )
    && istSchaltjahrCheck(1830, false )
    && istSchaltjahrCheck(1831, false )
    && istSchaltjahrCheck(1832, true )
    && istSchaltjahrCheck(1833, false )
    && istSchaltjahrCheck(1834, false )
    && istSchaltjahrCheck(1835, false )
    && istSchaltjahrCheck(1836, true )
    && istSchaltjahrCheck(1837, false )
    && istSchaltjahrCheck(1838, false )
    && istSchaltjahrCheck(1839, false )
    && istSchaltjahrCheck(1840, true )
    && istSchaltjahrCheck(1841, false )
    && istSchaltjahrCheck(1842, false )
    && istSchaltjahrCheck(1843, false )
    && istSchaltjahrCheck(1844, true )
    && istSchaltjahrCheck(1845, false )
    && istSchaltjahrCheck(1846, false )
    && istSchaltjahrCheck(1847, false )
    && istSchaltjahrCheck(1848, true )
    && istSchaltjahrCheck(1849, false )
    && istSchaltjahrCheck(1850, false )
    && istSchaltjahrCheck(1851, false )
    && istSchaltjahrCheck(1852, true )
    && istSchaltjahrCheck(1853, false )
    && istSchaltjahrCheck(1854, false )
    && istSchaltjahrCheck(1855, false )
    && istSchaltjahrCheck(1856, true )
    && istSchaltjahrCheck(1857, false )
    && istSchaltjahrCheck(1858, false )
    && istSchaltjahrCheck(1859, false )
    && istSchaltjahrCheck(1860, true )
    && istSchaltjahrCheck(1861, false )
    && istSchaltjahrCheck(1862, false )
    && istSchaltjahrCheck(1863, false )
    && istSchaltjahrCheck(1864, true )
    && istSchaltjahrCheck(1865, false )
    && istSchaltjahrCheck(1866, false )
    && istSchaltjahrCheck(1867, false )
    && istSchaltjahrCheck(1868, true )
    && istSchaltjahrCheck(1869, false )
    && istSchaltjahrCheck(1870, false )
    && istSchaltjahrCheck(1871, false )
    && istSchaltjahrCheck(1872, true )
    && istSchaltjahrCheck(1873, false )
    && istSchaltjahrCheck(1874, false )
    && istSchaltjahrCheck(1875, false )
    && istSchaltjahrCheck(1876, true )
    && istSchaltjahrCheck(1877, false )
    && istSchaltjahrCheck(1878, false )
    && istSchaltjahrCheck(1879, false )
    && istSchaltjahrCheck(1880, true )
    && istSchaltjahrCheck(1881, false )
    && istSchaltjahrCheck(1882, false )
    && istSchaltjahrCheck(1883, false )
    && istSchaltjahrCheck(1884, true )
    && istSchaltjahrCheck(1885, false )
    && istSchaltjahrCheck(1886, false )
    && istSchaltjahrCheck(1887, false )
    && istSchaltjahrCheck(1888, true )
    && istSchaltjahrCheck(1889, false )
    && istSchaltjahrCheck(1890, false )
    && istSchaltjahrCheck(1891, false )
    && istSchaltjahrCheck(1892, true )
    && istSchaltjahrCheck(1893, false )
    && istSchaltjahrCheck(1894, false )
    && istSchaltjahrCheck(1895, false )
    && istSchaltjahrCheck(1896, true )
    && istSchaltjahrCheck(1897, false )
    && istSchaltjahrCheck(1898, false )
    && istSchaltjahrCheck(1899, false )
    && istSchaltjahrCheck(1900, false )
    && istSchaltjahrCheck(1901, false )
    && istSchaltjahrCheck(1902, false )
    && istSchaltjahrCheck(1903, false )
    && istSchaltjahrCheck(1904, true )
    && istSchaltjahrCheck(1905, false )
    && istSchaltjahrCheck(1906, false )
    && istSchaltjahrCheck(1907, false )
    && istSchaltjahrCheck(1908, true )
    && istSchaltjahrCheck(1909, false )
    && istSchaltjahrCheck(1910, false )
    && istSchaltjahrCheck(1911, false )
    && istSchaltjahrCheck(1912, true )
    && istSchaltjahrCheck(1913, false )
    && istSchaltjahrCheck(1914, false )
    && istSchaltjahrCheck(1915, false )
    && istSchaltjahrCheck(1916, true )
    && istSchaltjahrCheck(1917, false )
    && istSchaltjahrCheck(1918, false )
    && istSchaltjahrCheck(1919, false )
    && istSchaltjahrCheck(1920, true )
    && istSchaltjahrCheck(1921, false )
    && istSchaltjahrCheck(1922, false )
    && istSchaltjahrCheck(1923, false )
    && istSchaltjahrCheck(1924, true )
    && istSchaltjahrCheck(1925, false )
    && istSchaltjahrCheck(1926, false )
    && istSchaltjahrCheck(1927, false )
    && istSchaltjahrCheck(1928, true )
    && istSchaltjahrCheck(1929, false )
    && istSchaltjahrCheck(1930, false )
    && istSchaltjahrCheck(1931, false )
    && istSchaltjahrCheck(1932, true )
    && istSchaltjahrCheck(1933, false )
    && istSchaltjahrCheck(1934, false )
    && istSchaltjahrCheck(1935, false )
    && istSchaltjahrCheck(1936, true )
    && istSchaltjahrCheck(1937, false )
    && istSchaltjahrCheck(1938, false )
    && istSchaltjahrCheck(1939, false )
    && istSchaltjahrCheck(1940, true )
    && istSchaltjahrCheck(1941, false )
    && istSchaltjahrCheck(1942, false )
    && istSchaltjahrCheck(1943, false )
    && istSchaltjahrCheck(1944, true )
    && istSchaltjahrCheck(1945, false )
    && istSchaltjahrCheck(1946, false )
    && istSchaltjahrCheck(1947, false )
    && istSchaltjahrCheck(1948, true )
    && istSchaltjahrCheck(1949, false )
    && istSchaltjahrCheck(1950, false )
    && istSchaltjahrCheck(1951, false )
    && istSchaltjahrCheck(1952, true )
    && istSchaltjahrCheck(1953, false )
    && istSchaltjahrCheck(1954, false )
    && istSchaltjahrCheck(1955, false )
    && istSchaltjahrCheck(1956, true )
    && istSchaltjahrCheck(1957, false )
    && istSchaltjahrCheck(1958, false )
    && istSchaltjahrCheck(1959, false )
    && istSchaltjahrCheck(1960, true )
    && istSchaltjahrCheck(1961, false )
    && istSchaltjahrCheck(1962, false )
    && istSchaltjahrCheck(1963, false )
    && istSchaltjahrCheck(1964, true )
    && istSchaltjahrCheck(1965, false )
    && istSchaltjahrCheck(1966, false )
    && istSchaltjahrCheck(1967, false )
    && istSchaltjahrCheck(1968, true )
    && istSchaltjahrCheck(1969, false )
    && istSchaltjahrCheck(1970, false )
    && istSchaltjahrCheck(1971, false )
    && istSchaltjahrCheck(1972, true )
    && istSchaltjahrCheck(1973, false )
    && istSchaltjahrCheck(1974, false )
    && istSchaltjahrCheck(1975, false )
    && istSchaltjahrCheck(1976, true )
    && istSchaltjahrCheck(1977, false )
    && istSchaltjahrCheck(1978, false )
    && istSchaltjahrCheck(1979, false )
    && istSchaltjahrCheck(1980, true )
    && istSchaltjahrCheck(1981, false )
    && istSchaltjahrCheck(1982, false )
    && istSchaltjahrCheck(1983, false )
    && istSchaltjahrCheck(1984, true )
    && istSchaltjahrCheck(1985, false )
    && istSchaltjahrCheck(1986, false )
    && istSchaltjahrCheck(1987, false )
    && istSchaltjahrCheck(1988, true )
    && istSchaltjahrCheck(1989, false )
    && istSchaltjahrCheck(1990, false )
    && istSchaltjahrCheck(1991, false )
    && istSchaltjahrCheck(1992, true )
    && istSchaltjahrCheck(1993, false )
    && istSchaltjahrCheck(1994, false )
    && istSchaltjahrCheck(1995, false )
    && istSchaltjahrCheck(1996, true )
    && istSchaltjahrCheck(1997, false )
    && istSchaltjahrCheck(1998, false )
    && istSchaltjahrCheck(1999, false )
    && istSchaltjahrCheck(2000, true )
    && istSchaltjahrCheck(2001, false )
    && istSchaltjahrCheck(2002, false )
    && istSchaltjahrCheck(2003, false )
    && istSchaltjahrCheck(2004, true )
    && istSchaltjahrCheck(2005, false )
    && istSchaltjahrCheck(2006, false )
    && istSchaltjahrCheck(2007, false )
    && istSchaltjahrCheck(2008, true )
    && istSchaltjahrCheck(2009, false )
    && istSchaltjahrCheck(2010, false )
    && istSchaltjahrCheck(2011, false )
    && istSchaltjahrCheck(2012, true )
    && istSchaltjahrCheck(2013, false )
    && istSchaltjahrCheck(2014, false )
    && istSchaltjahrCheck(2015, false )
    && istSchaltjahrCheck(2016, true )
    && istSchaltjahrCheck(2017, false )
    && istSchaltjahrCheck(2018, false )
    && istSchaltjahrCheck(2019, false )
    && istSchaltjahrCheck(2020, true )
    && istSchaltjahrCheck(2021, false )
    && istSchaltjahrCheck(2022, false )
    && istSchaltjahrCheck(2023, false )
    && istSchaltjahrCheck(2024, true )
    && istSchaltjahrCheck(2025, false )
    && istSchaltjahrCheck(2026, false )
    && istSchaltjahrCheck(2027, false )
    && istSchaltjahrCheck(2028, true )
    && istSchaltjahrCheck(2029, false )
    && istSchaltjahrCheck(2030, false )
    && istSchaltjahrCheck(2031, false )
    && istSchaltjahrCheck(2032, true )
    && istSchaltjahrCheck(2033, false )
    && istSchaltjahrCheck(2034, false )
    && istSchaltjahrCheck(2035, false )
    && istSchaltjahrCheck(2036, true )
    && istSchaltjahrCheck(2037, false )
    && istSchaltjahrCheck(2038, false )
    && istSchaltjahrCheck(2039, false )
    && istSchaltjahrCheck(2040, true )
    && istSchaltjahrCheck(2041, false )
    && istSchaltjahrCheck(2042, false )
    && istSchaltjahrCheck(2043, false )
    && istSchaltjahrCheck(2044, true )
    && istSchaltjahrCheck(2045, false )
    && istSchaltjahrCheck(2046, false )
    && istSchaltjahrCheck(2047, false )
    && istSchaltjahrCheck(2048, true )
    && istSchaltjahrCheck(2049, false )
    && istSchaltjahrCheck(2050, false )
    && istSchaltjahrCheck(2051, false )
    && istSchaltjahrCheck(2052, true )
    && istSchaltjahrCheck(2053, false )
    && istSchaltjahrCheck(2054, false )
    && istSchaltjahrCheck(2055, false )
    && istSchaltjahrCheck(2056, true )
    && istSchaltjahrCheck(2057, false )
    && istSchaltjahrCheck(2058, false )
    && istSchaltjahrCheck(2059, false )
    && istSchaltjahrCheck(2060, true )
    && istSchaltjahrCheck(2061, false )
    && istSchaltjahrCheck(2062, false )
    && istSchaltjahrCheck(2063, false )
    && istSchaltjahrCheck(2064, true )
    && istSchaltjahrCheck(2065, false )
    && istSchaltjahrCheck(2066, false )
    && istSchaltjahrCheck(2067, false )
    && istSchaltjahrCheck(2068, true )
    && istSchaltjahrCheck(2069, false )
    && istSchaltjahrCheck(2070, false )
    && istSchaltjahrCheck(2071, false )
    && istSchaltjahrCheck(2072, true )
    && istSchaltjahrCheck(2073, false )
    && istSchaltjahrCheck(2074, false )
    && istSchaltjahrCheck(2075, false )
    && istSchaltjahrCheck(2076, true )
    && istSchaltjahrCheck(2077, false )
    && istSchaltjahrCheck(2078, false )
    && istSchaltjahrCheck(2079, false )
    && istSchaltjahrCheck(2080, true )
    && istSchaltjahrCheck(2081, false )
    && istSchaltjahrCheck(2082, false )
    && istSchaltjahrCheck(2083, false )
    && istSchaltjahrCheck(2084, true )
    && istSchaltjahrCheck(2085, false )
    && istSchaltjahrCheck(2086, false )
    && istSchaltjahrCheck(2087, false )
    && istSchaltjahrCheck(2088, true )
    && istSchaltjahrCheck(2089, false )
    && istSchaltjahrCheck(2090, false )
    && istSchaltjahrCheck(2091, false )
    && istSchaltjahrCheck(2092, true )
    && istSchaltjahrCheck(2093, false )
    && istSchaltjahrCheck(2094, false )
    && istSchaltjahrCheck(2095, false )
    && istSchaltjahrCheck(2096, true )
    && istSchaltjahrCheck(2097, false )
    && istSchaltjahrCheck(2098, false )
    && istSchaltjahrCheck(2099, false )
    && istSchaltjahrCheck(2100, false )
    && istSchaltjahrCheck(2101, false )
    && istSchaltjahrCheck(2102, false )
    && istSchaltjahrCheck(2103, false )
    && istSchaltjahrCheck(2104, true )
    && istSchaltjahrCheck(2105, false )
    && istSchaltjahrCheck(2106, false )
    && istSchaltjahrCheck(2107, false )
    && istSchaltjahrCheck(2108, true )
    && istSchaltjahrCheck(2109, false )
    && istSchaltjahrCheck(2110, false )
    && istSchaltjahrCheck(2111, false )
    && istSchaltjahrCheck(2112, true )
    && istSchaltjahrCheck(2113, false )
    && istSchaltjahrCheck(2114, false )
    && istSchaltjahrCheck(2115, false )
    && istSchaltjahrCheck(2116, true )
    && istSchaltjahrCheck(2117, false )
    && istSchaltjahrCheck(2118, false )
    && istSchaltjahrCheck(2119, false )
    && istSchaltjahrCheck(2120, true )
    && istSchaltjahrCheck(2121, false )
    && istSchaltjahrCheck(2122, false )
    && istSchaltjahrCheck(2123, false )
    && istSchaltjahrCheck(2124, true )
    && istSchaltjahrCheck(2125, false )
    && istSchaltjahrCheck(2126, false )
    && istSchaltjahrCheck(2127, false )
    && istSchaltjahrCheck(2128, true )
    && istSchaltjahrCheck(2129, false )
    && istSchaltjahrCheck(2130, false )
    && istSchaltjahrCheck(2131, false )
    && istSchaltjahrCheck(2132, true )
    && istSchaltjahrCheck(2133, false )
    && istSchaltjahrCheck(2134, false )
    && istSchaltjahrCheck(2135, false )
    && istSchaltjahrCheck(2136, true )
    && istSchaltjahrCheck(2137, false )
    && istSchaltjahrCheck(2138, false )
    && istSchaltjahrCheck(2139, false );
  }

  public static boolean test() {
    return istSchaltjahrTest();
  }
}