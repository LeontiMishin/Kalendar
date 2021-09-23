
package kalendar;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Kalendar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Программа выдаёт название года по номеру");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year= scanner.nextInt();
        System.out.println("Год");
        
        switch(year) {
            case 1984: case 1985: case 1986: case 1987: case 1988: case 1989: case 1990:  case 1991: case 1992: case 1993: case 1994: case 1995: 
            System.out.println("Зеленой");
            break;
            case 1996: case 1997: case 1998: case 1999: case 2000: case 2001: case 2002:  case 2003: case 2004: case 2005: case 2006: case 2007: 
            System.out.println("Красной");
            break;
            case 2008: case 2009: case 2010: case 2011: case 2012: case 2013: case 2014: case 2015: case 2016: case 2017: case 2018: case 2019: 
            System.out.println("Желтой");
            break;
            case 2020: case 2021: case 2022: case 2023: case 2024: case 2025: case 2026: case 2027: case 2028: case 2029: case 2030: case 2031: 
            System.out.println("Белой");
            break;
            case 2032: case 2033: case 2034: case 2035: case 2036: case 2039: case 2040: case 2041: case 2042: case 2043: case 2044: case 2045: 
            System.out.println("Черной");
            break;
            default:
            System.out.println("*Программа неполной версии, только с 1984 до 2045*");
        }
        
        switch(year) {
            case 1984: case 1996: case 2008: case 2020: case 2032: case 2044: case 2045:
            System.out.println("Крысы");
            break; 
            case 1985: case 1997: case 2009: case 2021: case 2033:
            System.out.println("Коровы");
            break;
            case 1986: case 1998: case 2010: case 2022: case 2034:
            System.out.println("Тигры");
            break;
            case 1987: case 1999: case 2011: case 2023: case 2035:
            System.out.println("Зайки"); 
            break;
            case 1988: case 2000: case 2012: case 2024: case 2036:
            System.out.println("Дракоши");
            break;
            case 1989: case 2001: case 2013: case 2025: case 2037:
            System.out.println("Змеи");
            break;
            case 1990: case 2002: case 2014: case 2026: case 2038:
            System.out.println("Лошади");
            break;
            case 1991: case 2003: case 2015: case 2027: case 2039:
            System.out.println("Овцы");
            break;
            case 1992: case 2004: case 2016: case 2028: case 2040:
            System.out.println("Обезъяны");
            break;
            case 1993: case 2005: case 2017: case 2029: case 2041:
            System.out.println("Курицы");
            break;
            case 1994: case 2006: case 2018: case 2930: case 2042:
            System.out.println("Собаки");
            break;
            case 1995: case 2007: case 2019: case 2031: case 2043:
            System.out.println("Свиньи");
            break;
            default:
            System.out.println("*Программа неполной версии, только с 1984 до 2045*");;
            

            
            
        }
    }
    }