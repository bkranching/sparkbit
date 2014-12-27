package org.sparkbit.jsonrpc.autogen;

/**
 * DO NOT EDIT THIS FILE!
 * 
 * Generated by Barrister Idl2Java: https://github.com/coopernurse/barrister-java
 * 
 * Generated at: Sat Dec 27 10:35:19 PST 2014
 */
public class JSONRPCAddressBookEntry implements com.bitmechanic.barrister.BStruct {


    public static class Builder {
        private String _label;
        public Builder label(String label) { this._label = label; return this; }
        private String _bitcoin_address;
        public Builder bitcoin_address(String bitcoin_address) { this._bitcoin_address = bitcoin_address; return this; }
        private String _coinspark_address;
        public Builder coinspark_address(String coinspark_address) { this._coinspark_address = coinspark_address; return this; }
        public JSONRPCAddressBookEntry build() {
            return new JSONRPCAddressBookEntry(this._label, this._bitcoin_address, this._coinspark_address);
        }

        public Builder() { }
        public Builder(JSONRPCAddressBookEntry obj) {
            this._label = obj.getLabel();
            this._bitcoin_address = obj.getBitcoin_address();
            this._coinspark_address = obj.getCoinspark_address();
        }
    }

    private String bitcoin_address;
    private String label;
    private String coinspark_address;

    public JSONRPCAddressBookEntry() {
        super();
    }

    public JSONRPCAddressBookEntry(java.util.Map _map) throws com.bitmechanic.barrister.RpcException {
        this(
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("label"), false),
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("bitcoin_address"), false),
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("coinspark_address"), false)
        );
    }

    @org.codehaus.jackson.annotate.JsonCreator
    public JSONRPCAddressBookEntry(
            @org.codehaus.jackson.annotate.JsonProperty("label") String label, 
            @org.codehaus.jackson.annotate.JsonProperty("bitcoin_address") String bitcoin_address, 
            @org.codehaus.jackson.annotate.JsonProperty("coinspark_address") String coinspark_address) {
        super();
        this.label = label;
        this.bitcoin_address = bitcoin_address;
        this.coinspark_address = coinspark_address;
    }

    public void setBitcoin_address(String bitcoin_address) {
        this.bitcoin_address = bitcoin_address;
    }

    public String getBitcoin_address() {
        return this.bitcoin_address;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLabel() {
        return this.label;
    }

    public void setCoinspark_address(String coinspark_address) {
        this.coinspark_address = coinspark_address;
    }

    public String getCoinspark_address() {
        return this.coinspark_address;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("JSONRPCAddressBookEntry:");
        sb.append(" bitcoin_address=").append(bitcoin_address);
        sb.append(" label=").append(label);
        sb.append(" coinspark_address=").append(coinspark_address);
        return sb.toString();
    }

    @Override
    public boolean equals(Object _other) {
        if (this == _other) { return true; }
        if (_other == null) { return false; }
        if (!(_other instanceof JSONRPCAddressBookEntry)) { return false; }
        JSONRPCAddressBookEntry _o = (JSONRPCAddressBookEntry)_other;
        if (bitcoin_address == null && _o.bitcoin_address != null) { return false; }
        else if (bitcoin_address != null && !bitcoin_address.equals(_o.bitcoin_address)) { return false; }
        if (label == null && _o.label != null) { return false; }
        else if (label != null && !label.equals(_o.label)) { return false; }
        if (coinspark_address == null && _o.coinspark_address != null) { return false; }
        else if (coinspark_address != null && !coinspark_address.equals(_o.coinspark_address)) { return false; }
        return true;
    }

    @Override
    public int hashCode() {
        int _hash = 1;
        _hash = _hash * 31 + (bitcoin_address == null ? 0 : bitcoin_address.hashCode());
        _hash = _hash * 31 + (label == null ? 0 : label.hashCode());
        _hash = _hash * 31 + (coinspark_address == null ? 0 : coinspark_address.hashCode());
        return _hash;
    }
}

