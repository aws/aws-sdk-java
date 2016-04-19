package com.amazonaws.codegen.model.config.customization;

/**
 * Contains custom properties to override in service and intermediate model metadata.
 */
public class MetadataConfig {

    private String protocol;

    private String jsonContentVersion;

    public String getProtocol() { return protocol; }

    public void setProtocol(final String protocol) { this.protocol = protocol; }

    public String getJsonContentVersion() { return jsonContentVersion; }

    public void setJsonContentVersion(final String jsonContentVersion) { this.jsonContentVersion = jsonContentVersion; }

}
