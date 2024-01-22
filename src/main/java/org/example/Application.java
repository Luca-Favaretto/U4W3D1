package org.example;

public class Application {

    public static void main(String[] args) {
        System.out.println("Esercizio 1");

        /*
        SELECT * FROM public.clienti
        WHERE nome ILIKE 'mario'
         */

        System.out.println("Esercizio 2");

        /*
        SELECT clienti.nome, clienti.cognome FROM public.clienti
        WHERE EXTRACT (YEAR FROM anno_di_nascita)=1982;
         */

        System.out.println("Esercizio 3");

        /*
        SELECT COUNT(*)AS numero_fatture FROM public.fatture
        WHERE iva=20
         */

        System.out.println("Esercizio 4");

        /*
           SELECT*FROM public.prodotti
        WHERE EXTRACT (YEAR FROM data_attivazione)=2017
        AND (in_produzione = true OR in_commercio = true);

         */

        System.out.println("Esercizio 5");

        /*
        SELECT *
        FROM fatture
        JOIN clienti ON fatture.id_cliente = clienti.numero_clienti
        WHERE CAST(importo AS numeric) < 1000;
         */

        System.out.println("Esercizio 6");

        /*
        SELECT
            fatture.numero_fatture,
            fatture.importo,
            fatture.iva,
            fatture.data_fattura,
            fornitori.denominazione
        FROM
            fatture
        JOIN
            fornitori ON fornitori.numero_fornitore = fatture.numero_fornitore;
         */

        System.out.println("Esercizio 7");

        /*
         SELECT
         EXTRACT(YEAR FROM data_fattura) AS anno,
         COUNT(*) AS numero_fatture FROM fatture
         WHERE iva=20
         GROUP BY EXTRACT(YEAR FROM data_fattura)
         */

        System.out.println("Esercizio 8");

        /*
         SELECT EXTRACT(YEAR FROM data_fattura) AS anno,COUNT(*),SUM(CAST(importo AS numeric)) FROM fatture
         GROUP BY EXTRACT(YEAR FROM data_fattura)
         */

        System.out.println("Esercizio 9");

        /*
        SELECT EXTRACT(YEAR FROM data_fattura) AS anno,COUNT(*)AS numero_fatture
        FROM fatture
        WHERE tipologia ILIKE 'a'
        GROUP BY EXTRACT(YEAR FROM data_fattura)
        HAVING COUNT(*) > 2;
        */

        System.out.println("Esercizio 10");

        /*
        SELECT clienti.regione_residenza, SUM(fatture.importo)AS totale_importi
        FROM fatture
        JOIN clienti ON clienti.numero_clienti = fatture.id_cliente
        GROUP BY clienti.regione_residenza
         */

        System.out.println("Esercizio 11");

        /*
        SELECT clienti.nome, COUNT(DISTINCT clienti.numero_clienti) AS numero_fatture
        FROM clienti
        JOIN fatture ON clienti.numero_clienti = fatture.id_cliente
        WHERE EXTRACT(YEAR FROM clienti.anno_di_nascita) = 1980
          AND CAST(fatture.importo AS numeric) >= 50
        GROUP BY clienti.nome;

       SELECT COUNT(DISTINCT clienti.numero_clienti) AS numero_fatture
       FROM clienti
       JOIN fatture ON clienti.numero_clienti = fatture.id_cliente
       WHERE EXTRACT(YEAR FROM clienti.anno_di_nascita) = 1980
       AND CAST(fatture.importo AS numeric) >= 50

         */
    }
}
