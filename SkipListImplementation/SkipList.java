package SkipListImplementation;

public class SkipList {

    private SkipListNode header;

    private SkipListNode tail;

    /**
     * Record the number of layers of the node with the largest number of layers in the current SkipList
     * The number of layers of head node are not counted
     */
    private int level;

    private int length;

    /**
     * Create a new SkipList
     * O(1)
     */
    private SkipList zslCreate() {

        return new SkipList();

    }

    /**
     * Free given skipList and all skipNodes
     * O(N)
     */
    private void zslFree(SkipList skipList) {

    }

    /**
     * Insert the new skipNode into skipList
     * fail - 0, success - 1
     * O(logN) - O(N)
     */
    private Integer zslInsert(double score, Object member) {

        return 1;

    }

    /**
     * Delete the skipNode from skipList
     * fail - 0, success - 1
     * O(logN) - O(N)
     */
    private Integer zslDelete(double score, Object member) {

        return 1;

    }

    /**
     * Return the rank in skipList with given score and member
     * O(logN) - O(N)
     */
    private Integer zslGetRank(double score, Object member) {

        return 1;

    }


    /**
     * Return the SkipListNode in skipList with given rank
     * O(logN) - O(N)
     */
    private SkipListNode zslGetElementByRank(int rank) {

        return new SkipListNode();

    }

    /**
     * Check whether there is at least one SkipListNode score in the given range
     * O(1)
     */
    private Integer zslIsInRange(double start, double end) {

        return 1;

    }

    /**
     * Return the first SkipListNode in the given range
     * O(logN) - O(N)
     */
    private SkipListNode zslFirstInRange(double start, double end) {

        return new SkipListNode();

    }

    /**
     * Return the last SkipListNode in the given range
     * O(logN) - O(N)
     */
    private SkipListNode zslLastInRange(double start, double end) {

        return new SkipListNode();

    }

    /**
     * Delete all SkipListNode in the given range
     * O(N)
     */
    private Integer zslDeleteRangeByScore(double start, double end) {

        return 1;

    }

    /**
     * Delete all SkipListNode in the given rank
     * O(N)
     */
    private Integer zslDeleteRangeByRank(int start, int end) {

        return 1;

    }


}
