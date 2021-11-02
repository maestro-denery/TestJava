package io.denery.packets;

import io.denery.packetutil.Packet;

public class AuthPacket extends Packet {
    public AuthPacket(byte[] data) {
        super((byte) 0x1, data);
    }

    public AuthPacket() {
        super((byte) 0x1);
    }
}
