package it.unicam.cs.asdl.essorting;

import java.util.List;

// TODO completare import

/**
 * Implementazione dell'algoritmo di Insertion Sort integrata nel framework di
 * valutazione numerica. L'implementazione è in loco.
 * 
 * @author Template: Luca Tesei, Implementazione: Collettiva
 *
 * @param <E>
 *                Una classe su cui sia definito un ordinamento naturale.
 */
public class InsertionSort<E extends Comparable<E>>
        implements SortingAlgorithm<E> {

    /** Ordina la lista secondo l'ordine naturale e restituisce la misura dei confronti.
     * La lista e' modificata in-place secondo il contratto di questa implementazione.
     * @param l lista da ordinare, non nulla
     * @return risultato contenente la lista e il numero di confronti
     * @throws NullPointerException se la lista e' nulla
     */
    @Override
    public SortingAlgorithmResult<E> sort(List<E> l) {
        // TODO implementare
        return null;
    }

    public String getName() {
        return "InsertionSort";
    }
}
