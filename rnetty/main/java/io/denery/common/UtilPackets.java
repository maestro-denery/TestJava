package io.denery.common;

/**
 *   Enum containing library's utility types of packets.
 */
public enum UtilPackets {
    /**
     *  An empty packet type, that's why you can't
     */
    EMPTY((byte) 0x0);

    public byte getId() {
        return id;
    }

    private byte id;
    private UtilPackets(byte id) {
        this.id = id;
    }

    public static class EmptyPacket extends Packet {
        public EmptyPacket() {
            super(UtilPackets.EMPTY, new byte[0]);
        }
    }
}