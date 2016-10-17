/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <note>
 * <p>
 * Amazon EMR releases 4.x or later.
 * </p>
 * </note>
 * <p>
 * Specifies a hardware and software configuration of the EMR cluster. This includes configurations for applications and
 * software bundled with Amazon EMR. The Configuration object is a JSON object which is defined by a classification and
 * a set of properties. Configurations can be nested, so a configuration may have its own Configuration objects listed.
 * </p>
 */
public class Configuration implements Serializable, Cloneable {

    /**
     * <p>
     * The classification of a configuration. For more information see, <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/API/EmrConfigurations.html">Amazon EMR
     * Configurations</a>.
     * </p>
     */
    private String classification;
    /**
     * <p>
     * A list of configurations you apply to this configuration object.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Configuration> configurations;
    /**
     * <p>
     * A set of properties supplied to the Configuration object.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> properties;

    /**
     * <p>
     * The classification of a configuration. For more information see, <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/API/EmrConfigurations.html">Amazon EMR
     * Configurations</a>.
     * </p>
     * 
     * @param classification
     *        The classification of a configuration. For more information see, <a
     *        href="http://docs.aws.amazon.com/ElasticMapReduce/latest/API/EmrConfigurations.html">Amazon EMR
     *        Configurations</a>.
     */

    public void setClassification(String classification) {
        this.classification = classification;
    }

    /**
     * <p>
     * The classification of a configuration. For more information see, <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/API/EmrConfigurations.html">Amazon EMR
     * Configurations</a>.
     * </p>
     * 
     * @return The classification of a configuration. For more information see, <a
     *         href="http://docs.aws.amazon.com/ElasticMapReduce/latest/API/EmrConfigurations.html">Amazon EMR
     *         Configurations</a>.
     */

    public String getClassification() {
        return this.classification;
    }

    /**
     * <p>
     * The classification of a configuration. For more information see, <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/API/EmrConfigurations.html">Amazon EMR
     * Configurations</a>.
     * </p>
     * 
     * @param classification
     *        The classification of a configuration. For more information see, <a
     *        href="http://docs.aws.amazon.com/ElasticMapReduce/latest/API/EmrConfigurations.html">Amazon EMR
     *        Configurations</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Configuration withClassification(String classification) {
        setClassification(classification);
        return this;
    }

    /**
     * <p>
     * A list of configurations you apply to this configuration object.
     * </p>
     * 
     * @return A list of configurations you apply to this configuration object.
     */

    public java.util.List<Configuration> getConfigurations() {
        if (configurations == null) {
            configurations = new com.amazonaws.internal.SdkInternalList<Configuration>();
        }
        return configurations;
    }

    /**
     * <p>
     * A list of configurations you apply to this configuration object.
     * </p>
     * 
     * @param configurations
     *        A list of configurations you apply to this configuration object.
     */

    public void setConfigurations(java.util.Collection<Configuration> configurations) {
        if (configurations == null) {
            this.configurations = null;
            return;
        }

        this.configurations = new com.amazonaws.internal.SdkInternalList<Configuration>(configurations);
    }

    /**
     * <p>
     * A list of configurations you apply to this configuration object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigurations(java.util.Collection)} or {@link #withConfigurations(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param configurations
     *        A list of configurations you apply to this configuration object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Configuration withConfigurations(Configuration... configurations) {
        if (this.configurations == null) {
            setConfigurations(new com.amazonaws.internal.SdkInternalList<Configuration>(configurations.length));
        }
        for (Configuration ele : configurations) {
            this.configurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of configurations you apply to this configuration object.
     * </p>
     * 
     * @param configurations
     *        A list of configurations you apply to this configuration object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Configuration withConfigurations(java.util.Collection<Configuration> configurations) {
        setConfigurations(configurations);
        return this;
    }

    /**
     * <p>
     * A set of properties supplied to the Configuration object.
     * </p>
     * 
     * @return A set of properties supplied to the Configuration object.
     */

    public java.util.Map<String, String> getProperties() {
        if (properties == null) {
            properties = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return properties;
    }

    /**
     * <p>
     * A set of properties supplied to the Configuration object.
     * </p>
     * 
     * @param properties
     *        A set of properties supplied to the Configuration object.
     */

    public void setProperties(java.util.Map<String, String> properties) {
        this.properties = properties == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(properties);
    }

    /**
     * <p>
     * A set of properties supplied to the Configuration object.
     * </p>
     * 
     * @param properties
     *        A set of properties supplied to the Configuration object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Configuration withProperties(java.util.Map<String, String> properties) {
        setProperties(properties);
        return this;
    }

    public Configuration addPropertiesEntry(String key, String value) {
        if (null == this.properties) {
            this.properties = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.properties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.properties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Properties.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Configuration clearPropertiesEntries() {
        this.properties = null;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getClassification() != null)
            sb.append("Classification: " + getClassification() + ",");
        if (getConfigurations() != null)
            sb.append("Configurations: " + getConfigurations() + ",");
        if (getProperties() != null)
            sb.append("Properties: " + getProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Configuration == false)
            return false;
        Configuration other = (Configuration) obj;
        if (other.getClassification() == null ^ this.getClassification() == null)
            return false;
        if (other.getClassification() != null && other.getClassification().equals(this.getClassification()) == false)
            return false;
        if (other.getConfigurations() == null ^ this.getConfigurations() == null)
            return false;
        if (other.getConfigurations() != null && other.getConfigurations().equals(this.getConfigurations()) == false)
            return false;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false)
            return false;
        return true;
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
    public Configuration clone() {
        try {
            return (Configuration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
