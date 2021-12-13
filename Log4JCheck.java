import java.util.Properties;

class Log4JCheck
{
  public static void main(String[] args) {
    System.out.println("------------------------------------------------------------------");
    System.out.println("CVE 2021-44228 Log4J remote code execution - Java Settings Checker");
    System.out.println("------------------------------------------------------------------");

    Properties props = System.getProperties();

    System.out.println("Java Version: " + props.getProperty("java.version"));
    System.out.println("com.sun.jndi.ldap.object.trustURLCodebase: " + props.getProperty("com.sun.jndi.ldap.object.trustURLCodebase"));
    System.out.println("com.sun.jndi.rmi.object.trustURLCodebase: " + props.getProperty("com.sun.jndi.rmi.object.trustURLCodebase"));
    System.out.println("com.sun.jndi.cosnaming.object.trustURLCodebase: " + props.getProperty("com.sun.jndi.cosnaming.object.trustURLCodebase"));
  }
}
