/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;


/**
 * <p>
 * A description of the app.
 * </p>
 */
public class App implements Serializable {

    /**
     * The app ID.
     */
    private String appId;

    /**
     * The app stack ID.
     */
    private String stackId;

    /**
     * The app's short name.
     */
    private String shortname;

    /**
     * The app name.
     */
    private String name;

    /**
     * A description of the app.
     */
    private String description;

    /**
     * The app type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>rails, php, nodejs, static, other
     */
    private String type;

    /**
     * A <code>Source</code> object that describes the app repository.
     */
    private Source appSource;

    /**
     * The app vhost settings, with multiple domains separated by commas. For
     * example: <code>'www.example.com, example.com'</code>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> domains;

    /**
     * Whether to enable SSL for the app.
     */
    private Boolean enableSsl;

    /**
     * An <code>SslConfiguration</code> object with the SSL configuration.
     */
    private SslConfiguration sslConfiguration;

    /**
     * The contents of the stack attributes bag.
     */
    private java.util.Map<String,String> attributes;

    /**
     * When the app was created.
     */
    private String createdAt;

    /**
     * The app ID.
     *
     * @return The app ID.
     */
    public String getAppId() {
        return appId;
    }
    
    /**
     * The app ID.
     *
     * @param appId The app ID.
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }
    
    /**
     * The app ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param appId The app ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public App withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * The app stack ID.
     *
     * @return The app stack ID.
     */
    public String getStackId() {
        return stackId;
    }
    
    /**
     * The app stack ID.
     *
     * @param stackId The app stack ID.
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }
    
    /**
     * The app stack ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackId The app stack ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public App withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * The app's short name.
     *
     * @return The app's short name.
     */
    public String getShortname() {
        return shortname;
    }
    
    /**
     * The app's short name.
     *
     * @param shortname The app's short name.
     */
    public void setShortname(String shortname) {
        this.shortname = shortname;
    }
    
    /**
     * The app's short name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param shortname The app's short name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public App withShortname(String shortname) {
        this.shortname = shortname;
        return this;
    }

    /**
     * The app name.
     *
     * @return The app name.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The app name.
     *
     * @param name The app name.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The app name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The app name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public App withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * A description of the app.
     *
     * @return A description of the app.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A description of the app.
     *
     * @param description A description of the app.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A description of the app.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description A description of the app.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public App withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The app type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>rails, php, nodejs, static, other
     *
     * @return The app type.
     *
     * @see AppType
     */
    public String getType() {
        return type;
    }
    
    /**
     * The app type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>rails, php, nodejs, static, other
     *
     * @param type The app type.
     *
     * @see AppType
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * The app type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>rails, php, nodejs, static, other
     *
     * @param type The app type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see AppType
     */
    public App withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * The app type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>rails, php, nodejs, static, other
     *
     * @param type The app type.
     *
     * @see AppType
     */
    public void setType(AppType type) {
        this.type = type.toString();
    }
    
    /**
     * The app type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>rails, php, nodejs, static, other
     *
     * @param type The app type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see AppType
     */
    public App withType(AppType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * A <code>Source</code> object that describes the app repository.
     *
     * @return A <code>Source</code> object that describes the app repository.
     */
    public Source getAppSource() {
        return appSource;
    }
    
    /**
     * A <code>Source</code> object that describes the app repository.
     *
     * @param appSource A <code>Source</code> object that describes the app repository.
     */
    public void setAppSource(Source appSource) {
        this.appSource = appSource;
    }
    
    /**
     * A <code>Source</code> object that describes the app repository.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param appSource A <code>Source</code> object that describes the app repository.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public App withAppSource(Source appSource) {
        this.appSource = appSource;
        return this;
    }

    /**
     * The app vhost settings, with multiple domains separated by commas. For
     * example: <code>'www.example.com, example.com'</code>
     *
     * @return The app vhost settings, with multiple domains separated by commas. For
     *         example: <code>'www.example.com, example.com'</code>
     */
    public java.util.List<String> getDomains() {
        if (domains == null) {
              domains = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              domains.setAutoConstruct(true);
        }
        return domains;
    }
    
    /**
     * The app vhost settings, with multiple domains separated by commas. For
     * example: <code>'www.example.com, example.com'</code>
     *
     * @param domains The app vhost settings, with multiple domains separated by commas. For
     *         example: <code>'www.example.com, example.com'</code>
     */
    public void setDomains(java.util.Collection<String> domains) {
        if (domains == null) {
            this.domains = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> domainsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(domains.size());
        domainsCopy.addAll(domains);
        this.domains = domainsCopy;
    }
    
    /**
     * The app vhost settings, with multiple domains separated by commas. For
     * example: <code>'www.example.com, example.com'</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param domains The app vhost settings, with multiple domains separated by commas. For
     *         example: <code>'www.example.com, example.com'</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public App withDomains(String... domains) {
        if (getDomains() == null) setDomains(new java.util.ArrayList<String>(domains.length));
        for (String value : domains) {
            getDomains().add(value);
        }
        return this;
    }
    
    /**
     * The app vhost settings, with multiple domains separated by commas. For
     * example: <code>'www.example.com, example.com'</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param domains The app vhost settings, with multiple domains separated by commas. For
     *         example: <code>'www.example.com, example.com'</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public App withDomains(java.util.Collection<String> domains) {
        if (domains == null) {
            this.domains = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> domainsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(domains.size());
            domainsCopy.addAll(domains);
            this.domains = domainsCopy;
        }

        return this;
    }

    /**
     * Whether to enable SSL for the app.
     *
     * @return Whether to enable SSL for the app.
     */
    public Boolean isEnableSsl() {
        return enableSsl;
    }
    
    /**
     * Whether to enable SSL for the app.
     *
     * @param enableSsl Whether to enable SSL for the app.
     */
    public void setEnableSsl(Boolean enableSsl) {
        this.enableSsl = enableSsl;
    }
    
    /**
     * Whether to enable SSL for the app.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enableSsl Whether to enable SSL for the app.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public App withEnableSsl(Boolean enableSsl) {
        this.enableSsl = enableSsl;
        return this;
    }

    /**
     * Whether to enable SSL for the app.
     *
     * @return Whether to enable SSL for the app.
     */
    public Boolean getEnableSsl() {
        return enableSsl;
    }

    /**
     * An <code>SslConfiguration</code> object with the SSL configuration.
     *
     * @return An <code>SslConfiguration</code> object with the SSL configuration.
     */
    public SslConfiguration getSslConfiguration() {
        return sslConfiguration;
    }
    
    /**
     * An <code>SslConfiguration</code> object with the SSL configuration.
     *
     * @param sslConfiguration An <code>SslConfiguration</code> object with the SSL configuration.
     */
    public void setSslConfiguration(SslConfiguration sslConfiguration) {
        this.sslConfiguration = sslConfiguration;
    }
    
    /**
     * An <code>SslConfiguration</code> object with the SSL configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sslConfiguration An <code>SslConfiguration</code> object with the SSL configuration.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public App withSslConfiguration(SslConfiguration sslConfiguration) {
        this.sslConfiguration = sslConfiguration;
        return this;
    }

    /**
     * The contents of the stack attributes bag.
     *
     * @return The contents of the stack attributes bag.
     */
    public java.util.Map<String,String> getAttributes() {
        
        if (attributes == null) {
            attributes = new java.util.HashMap<String,String>();
        }
        return attributes;
    }
    
    /**
     * The contents of the stack attributes bag.
     *
     * @param attributes The contents of the stack attributes bag.
     */
    public void setAttributes(java.util.Map<String,String> attributes) {
        this.attributes = attributes;
    }
    
    /**
     * The contents of the stack attributes bag.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes The contents of the stack attributes bag.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public App withAttributes(java.util.Map<String,String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * The contents of the stack attributes bag.
     * <p>
     * The method adds a new key-value pair into Attributes parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Attributes.
     * @param value The corresponding value of the entry to be added into Attributes.
     */
	public App addAttributesEntry(String key, String value) {
		if (null == this.attributes) {
			this.attributes = new java.util.HashMap<String,String>();
		}
		if (this.attributes.containsKey(key))
			throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
		this.attributes.put(key, value);
		return this;
	}

	/**
	 * Removes all the entries added into Attributes.
	 * <p>
	 * Returns a reference to this object so that method calls can be chained together.
	 */
	public App clearAttributesEntries() {
		this.attributes = null;
		return this;
	}
	
    /**
     * When the app was created.
     *
     * @return When the app was created.
     */
    public String getCreatedAt() {
        return createdAt;
    }
    
    /**
     * When the app was created.
     *
     * @param createdAt When the app was created.
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    
    /**
     * When the app was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdAt When the app was created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public App withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAppId() != null) sb.append("AppId: " + getAppId() + ",");
        if (getStackId() != null) sb.append("StackId: " + getStackId() + ",");
        if (getShortname() != null) sb.append("Shortname: " + getShortname() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getType() != null) sb.append("Type: " + getType() + ",");
        if (getAppSource() != null) sb.append("AppSource: " + getAppSource() + ",");
        if (getDomains() != null) sb.append("Domains: " + getDomains() + ",");
        if (isEnableSsl() != null) sb.append("EnableSsl: " + isEnableSsl() + ",");
        if (getSslConfiguration() != null) sb.append("SslConfiguration: " + getSslConfiguration() + ",");
        if (getAttributes() != null) sb.append("Attributes: " + getAttributes() + ",");
        if (getCreatedAt() != null) sb.append("CreatedAt: " + getCreatedAt() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode()); 
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode()); 
        hashCode = prime * hashCode + ((getShortname() == null) ? 0 : getShortname().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode()); 
        hashCode = prime * hashCode + ((getAppSource() == null) ? 0 : getAppSource().hashCode()); 
        hashCode = prime * hashCode + ((getDomains() == null) ? 0 : getDomains().hashCode()); 
        hashCode = prime * hashCode + ((isEnableSsl() == null) ? 0 : isEnableSsl().hashCode()); 
        hashCode = prime * hashCode + ((getSslConfiguration() == null) ? 0 : getSslConfiguration().hashCode()); 
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof App == false) return false;
        App other = (App)obj;
        
        if (other.getAppId() == null ^ this.getAppId() == null) return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false) return false; 
        if (other.getStackId() == null ^ this.getStackId() == null) return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false) return false; 
        if (other.getShortname() == null ^ this.getShortname() == null) return false;
        if (other.getShortname() != null && other.getShortname().equals(this.getShortname()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false; 
        if (other.getAppSource() == null ^ this.getAppSource() == null) return false;
        if (other.getAppSource() != null && other.getAppSource().equals(this.getAppSource()) == false) return false; 
        if (other.getDomains() == null ^ this.getDomains() == null) return false;
        if (other.getDomains() != null && other.getDomains().equals(this.getDomains()) == false) return false; 
        if (other.isEnableSsl() == null ^ this.isEnableSsl() == null) return false;
        if (other.isEnableSsl() != null && other.isEnableSsl().equals(this.isEnableSsl()) == false) return false; 
        if (other.getSslConfiguration() == null ^ this.getSslConfiguration() == null) return false;
        if (other.getSslConfiguration() != null && other.getSslConfiguration().equals(this.getSslConfiguration()) == false) return false; 
        if (other.getAttributes() == null ^ this.getAttributes() == null) return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false) return false; 
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null) return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false) return false; 
        return true;
    }
    
}
    