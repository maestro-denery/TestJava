package io.denery.common;

public enum BNPackets {
    AUTH((byte) 0x1),
    VERSION((byte) 0x2);

    public byte getId() {
        return id;
    }

    private byte id;
    private BNPackets(byte id) {
        this.id = id;
    }
}