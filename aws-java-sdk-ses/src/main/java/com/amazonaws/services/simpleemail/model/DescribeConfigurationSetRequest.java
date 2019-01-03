/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to return the details of a configuration set. Configuration sets enable you to publish email
 * sending events. For information about using configuration sets, see the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer
 * Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DescribeConfigurationSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConfigurationSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the configuration set to describe.
     * </p>
     */
    private String configurationSetName;
    /**
     * <p>
     * A list of configuration set attributes to return.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> configurationSetAttributeNames;

    /**
     * <p>
     * The name of the configuration set to describe.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set to describe.
     */

    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set to describe.
     * </p>
     * 
     * @return The name of the configuration set to describe.
     */

    public String getConfigurationSetName() {
        return this.configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set to describe.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationSetRequest withConfigurationSetName(String configurationSetName) {
        setConfigurationSetName(configurationSetName);
        return this;
    }

    /**
     * <p>
     * A list of configuration set attributes to return.
     * </p>
     * 
     * @return A list of configuration set attributes to return.
     * @see ConfigurationSetAttribute
     */

    public java.util.List<String> getConfigurationSetAttributeNames() {
        if (configurationSetAttributeNames == null) {
            configurationSetAttributeNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return configurationSetAttributeNames;
    }

    /**
     * <p>
     * A list of configuration set attributes to return.
     * </p>
     * 
     * @param configurationSetAttributeNames
     *        A list of configuration set attributes to return.
     * @see ConfigurationSetAttribute
     */

    public void setConfigurationSetAttributeNames(java.util.Collection<String> configurationSetAttributeNames) {
        if (configurationSetAttributeNames == null) {
            this.configurationSetAttributeNames = null;
            return;
        }

        this.configurationSetAttributeNames = new com.amazonaws.internal.SdkInternalList<String>(configurationSetAttributeNames);
    }

    /**
     * <p>
     * A list of configuration set attributes to return.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigurationSetAttributeNames(java.util.Collection)} or
     * {@link #withConfigurationSetAttributeNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param configurationSetAttributeNames
     *        A list of configuration set attributes to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationSetAttribute
     */

    public DescribeConfigurationSetRequest withConfigurationSetAttributeNames(String... configurationSetAttributeNames) {
        if (this.configurationSetAttributeNames == null) {
            setConfigurationSetAttributeNames(new com.amazonaws.internal.SdkInternalList<String>(configurationSetAttributeNames.length));
        }
        for (String ele : configurationSetAttributeNames) {
            this.configurationSetAttributeNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of configuration set attributes to return.
     * </p>
     * 
     * @param configurationSetAttributeNames
     *        A list of configuration set attributes to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationSetAttribute
     */

    public DescribeConfigurationSetRequest withConfigurationSetAttributeNames(java.util.Collection<String> configurationSetAttributeNames) {
        setConfigurationSetAttributeNames(configurationSetAttributeNames);
        return this;
    }

    /**
     * <p>
     * A list of configuration set attributes to return.
     * </p>
     * 
     * @param configurationSetAttributeNames
     *        A list of configuration set attributes to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationSetAttribute
     */

    public DescribeConfigurationSetRequest withConfigurationSetAttributeNames(ConfigurationSetAttribute... configurationSetAttributeNames) {
        com.amazonaws.internal.SdkInternalList<String> configurationSetAttributeNamesCopy = new com.amazonaws.internal.SdkInternalList<String>(
                configurationSetAttributeNames.length);
        for (ConfigurationSetAttribute value : configurationSetAttributeNames) {
            configurationSetAttributeNamesCopy.add(value.toString());
        }
        if (getConfigurationSetAttributeNames() == null) {
            setConfigurationSetAttributeNames(configurationSetAttributeNamesCopy);
        } else {
            getConfigurationSetAttributeNames().addAll(configurationSetAttributeNamesCopy);
        }
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getConfigurationSetName() != null)
            sb.append("ConfigurationSetName: ").append(getConfigurationSetName()).append(",");
        if (getConfigurationSetAttributeNames() != null)
            sb.append("ConfigurationSetAttributeNames: ").append(getConfigurationSetAttributeNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConfigurationSetRequest == false)
            return false;
        DescribeConfigurationSetRequest other = (DescribeConfigurationSetRequest) obj;
        if (other.getConfigurationSetName() == null ^ this.getConfigurationSetName() == null)
            return false;
        if (other.getConfigurationSetName() != null && other.getConfigurationSetName().equals(this.getConfigurationSetName()) == false)
            return false;
        if (other.getConfigurationSetAttributeNames() == null ^ this.getConfigurationSetAttributeNames() == null)
            return false;
        if (other.getConfigurationSetAttributeNames() != null
                && other.getConfigurationSetAttributeNames().equals(this.getConfigurationSetAttributeNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationSetName() == null) ? 0 : getConfigurationSetName().hashCode());
        hashCode = prime * hashCode + ((getConfigurationSetAttributeNames() == null) ? 0 : getConfigurationSetAttributeNames().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConfigurationSetRequest clone() {
        return (DescribeConfigurationSetRequest) super.clone();
    }

}
