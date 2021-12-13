# CVE_2021_44228_Check

A little widget to check if your JRE/JDK allows JNDI remote code execution by default

## Compiling

```bash
git clone https://github.com/trickyearlobe/CVE_2021_44228_Check
cd CVE_2021_44228_Check
javac Log4JCheck.java
```

## Running

```bash
java Log4JCheck
```

It should produce results similar to this

```bash
Java Version: 11.0.12
com.sun.jndi.ldap.object.trustURLCodebase: null
com.sun.jndi.rmi.object.trustURLCodebase: null
com.sun.jndi.cosnaming.object.trustURLCodebase: null
```

A `null` or `false` means remote JNDI code execution is disabled by default. A `true` means remote JNDI code execution is enabled.