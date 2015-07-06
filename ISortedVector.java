
/**
 * Ñàìîðàñøèðÿþùàÿñÿ êîëëåêöèÿ. Îáúåêòû õðàíÿòñÿ â ìàññèâå îòñîðòèðîâàííîì ïîðÿäêå.
 */
public interface ISortedVector<T extends Comparable<? super T>> {
    /**
     * Äîáàâëÿåò îáúåêò â êîëëåêöèþ
     * @param o
     */
    void add(T o);

    /**
     * Óäàëÿåò îáúåêò èç êîëëåêöèè, íàõîäÿùèéñÿ íà óêàçàííîé ïîçèöèè
     * @param index
     */
    void remove(int index);

    /**
     * Âîçâðàùàåò îáúåêò, íàõîäÿùèéñÿ íà îïðåäåëåííîé ïîçèöèè
     * @param index
     * @return
     */
    T get(int index);

    /**
     * Âîçâðàùàåò èíäåêñ îáúåêòà, åñëè òàêîé åñòü â âåêòîðå. Åñëè òàêîãî íåò, òî -1.
     * @param o
     * @return
     */
    int indexOf(T o);
}
