package com.shirosoft.samplelibrary.sampleconstant;

public interface sampleconstant {
    String chainConfig = "{\n" +
            "\"chain_id\": \"0afc093ffb509f059c55478bc1a60351cef7b4e9c008a53a6cc8241ca8617dfe\",\n" +
            "\"miners\": [\n" +
            "\"http://vira.devb.testnet-0chain.net:7071\",\n" +
            "\"http://virb.devb.testnet-0chain.net:7071\",\n" +
            "\"http://cala.devb.testnet-0chain.net:7071\",\n" +
            "\"http://calb.devb.testnet-0chain.net:7071\"\n" +
            "],\n" +
            "\"sharders\": [\n" +
            "\"http://cala.devb.testnet-0chain.net:7171\",\n" +
            "\"http://vira.devb.testnet-0chain.net:7171\"\n" +
            "],\n" +
            "\"signaturescheme\":\"bls0chain\",\n" +
            "\"data_shards\":4,\n" +
            "\"parity_shards\":2,\n" +
            "\"num_keys\":1}";
}
