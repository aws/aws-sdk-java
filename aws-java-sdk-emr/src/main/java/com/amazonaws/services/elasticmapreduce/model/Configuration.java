/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * <b>NOTE:</b> Amazon EMR releases 4.x or later.
 * </p>
 * <p>
 * Specifies a hardware and software configuration of the EMR cluster.
 * This includes configurations for applications and software bundled
 * with Amazon EMR. The Configuration object is a JSON object which is
 * defined by a classification and a set of properties. Configurations
 * can be nested, so a configuration may have its own Configuration
 * objects listed.
 * </p>
 */
public class Configuration implements Serializable, Cloneable {

    /**
     * The classification of a configuration. For more information see, <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/API/EmrConfigurations.html">Amazon
     * EMR Configurations</a>.
     */
    private String classification;

    /**
     * A list of configurations you apply to this configuration object.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Configuration> configurations;

    /**
     * A set of properties supplied to the Configuration object.
     */
    private java.util.Map<String,String> properties;

    /**
     * The classification of a configuration. For more information see, <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/API/EmrConfigurations.html">Amazon
     * EMR Configurations</a>.
     *
     * @return The classification of a configuration. For more information see, <a
     *         href="http://docs.aws.amazon.com/ElasticMapReduce/latest/API/EmrConfigurations.html">Amazon
     *         EMR Configurations</a>.
     */
    public String getClassification() {
        return classification;
    }
    
    /**
     * The classification of a configuration. For more information see, <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/API/EmrConfigurations.html">Amazon
     * EMR Configurations</a>.
     *
     * @param classification The classification of a configuration. For more information see, <a
     *         href="http://docs.aws.amazon.com/ElasticMapReduce/latest/API/EmrConfigurations.html">Amazon
     *         EMR Configurations</a>.
     */
    public void setClassification(String classification) {
        this.classification = classification;
    }
    
    /**
     * The classification of a configuration. For more information see, <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/API/EmrConfigurations.html">Amazon
     * EMR Configurations</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param classification The classification of a configuration. For more information see, <a
     *         href="http://docs.aws.amazon.com/ElasticMapReduce/latest/API/EmrConfigurations.html">Amazon
     *         EMR Configurations</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Configuration withClassification(String classification) {
        this.classification = classification;
        return this;
    }

    /**
     * A list of configurations you apply to this configuration object.
     *
     * @return A list of configurations you apply to this configuration object.
     */
    public java.util.List<Configuration> getConfigurations() {
        if (configurations == null) {
              configurations = new com.amazonaws.internal.ListWithAutoConstructFlag<Configuration>();
              configurations.setAutoConstruct(true);
        }
        return configurations;
    }
    
    /**
     * A list of configurations you apply to this configuration object.
     *
     * @param configurations A list of configurations you apply to this configuration object.
     */
    public void setConfigurations(java.util.Collection<Configuration> configurations) {
        if (configurations == null) {
            this.configurations = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Configuration> configurationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Configuration>(configurations.size());
        configurationsCopy.addAll(configurations);
        this.configurations = configurationsCopy;
    }
    
    /**
     * A list of configurations you apply to this configuration object.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setConfigurations(java.util.Collection)} or {@link
     * #withConfigurations(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configurations A list of configurations you apply to this configuration object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Configuration withConfigurations(Configuration... configurations) {
        if (getConfigurations() == null) setConfigurations(new java.util.ArrayList<Configuration>(configurations.length));
        for (Configuration value : configurations) {
            getConfigurations().add(value);
        }
        return this;
    }
    
    /**
     * A list of configurations you apply to this configuration object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configurations A list of configurations you apply to this configuration object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Configuration withConfigurations(java.util.Collection<Configuration> configurations) {
        if (configurations == null) {
            this.configurations = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Configuration> configurationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Configuration>(configurations.size());
            configurationsCopy.addAll(configurations);
            this.configurations = configurationsCopy;
        }

        return this;
    }

    /**
     * A set of properties supplied to the Configuration object.
     *
     * @return A set of properties supplied to the Configuration object.
     */
    public java.util.Map<String,String> getProperties() {
        
        if (properties == null) {
            properties = new java.util.HashMap<String,String>();
        }
        return properties;
    }
    
    /**
     * A set of properties supplied to the Configuration object.
     *
     * @param properties A set of properties supplied to the Configuration object.
     */
    public void setProperties(java.util.Map<String,String> properties) {
        this.properties = properties;
    }
    
    /**
     * A set of properties supplied to the Configuration object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param properties A set of properties supplied to the Configuration object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Configuration withProperties(java.util.Map<String,String> properties) {
        setProperties(properties);
        return this;
    }

    /**
     * A set of properties supplied to the Configuration object.
     * <p>
     * The method adds a new key-value pair into Properties parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Properties.
     * @param value The corresponding value of the entry to be added into Properties.
     */
  public Configuration addPropertiesEntry(String key, String value) {
    if (null == this.properties) {
      this.properties = new java.util.HashMap<String,String>();
    }
    if (this.properties.containsKey(key))
      throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
    this.properties.put(key, value);
    return this;
  }

  /**
   * Removes all the entries added into Properties.
   * <p>
   * Returns a reference to this object so that method calls can be chained together.
   */
  public Configuration clearPropertiesEntries() {
    this.properties = null;
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
        if (getClassification() != null) sb.append("Classification: " + getClassification() + ",");
        if (getConfigurations() != null) sb.append("Configurations: " + getConfigurations() + ",");
        if (getProperties() != null) sb.append("Properties: " + getProperties() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getClassification() == null) ? 0 : getClassification().hashCode()); 
        hashCode = prime * hashCode + ((getConfigurations() == null) ? 0 : getConfigurations().hashCode()); 
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Configuration == false) return false;
        Configuration other = (Configuration)obj;
        
        if (other.getClassification() == null ^ this.getClassification() == null) return false;
        if (other.getClassification() != null && other.getClassification().equals(this.getClassification()) == false) return false; 
        if (other.getConfigurations() == null ^ this.getConfigurations() == null) return false;
        if (other.getConfigurations() != null && other.getConfigurations().equals(this.getConfigurations()) == false) return false; 
        if (other.getProperties() == null ^ this.getProperties() == null) return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false) return false; 
        return true;
    }
    
    @Override
    public Configuration clone() {
        try {
            return (Configuration) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    