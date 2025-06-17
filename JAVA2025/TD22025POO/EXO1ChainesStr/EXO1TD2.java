/*
 * Exercice 1 : Manipuler les chaînes de caractères et extraire des informations. Écrire un programme qui prend une URL (ex: "https://uadb.sn") et affiche : 
- Le protocole (https) 
-Le nom de domaine (uadb) 
-L’extension (sn) 
👉 Utilisez les méthodes de la classe String : split(), substring(), indexOf()
 */

public class EXO1TD2 {
    public static void main(String[] args) {
        String url = "https://uadb.sn";
        String protocol = url.substring(0, url.indexOf(":"));
        String protocol2 = url.substring(0, 5);

        String domain = url.substring(url.indexOf("//") + 2, url.lastIndexOf("."));
        String extension = url.substring(url.lastIndexOf("."));

        System.out.println("Protocole M1 avec indexOf: " + protocol);
        System.out.println("Protocole M2 substring(0,4): " + protocol2);
        System.out.println("Nom de domaine : " + domain);
        System.out.println("Extension : " + extension);

    }
}
