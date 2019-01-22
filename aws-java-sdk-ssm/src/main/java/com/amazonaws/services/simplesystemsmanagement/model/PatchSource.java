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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the patches to use to update the instances, including target operating systems and source
 * repository. Applies to Linux instances only.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/PatchSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PatchSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name specified to identify the patch source.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The specific operating system versions a patch repository applies to, such as "Ubuntu16.04",
     * "AmazonLinux2016.09", "RedhatEnterpriseLinux7.2" or "Suse12.7". For lists of supported product values, see
     * <a>PatchFilter</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> products;
    /**
     * <p>
     * The value of the yum repo configuration. For example:
     * </p>
     * <p>
     * <code>[main]</code>
     * </p>
     * <p>
     * <code>cachedir=/var/cache/yum/$basesearch$releasever</code>
     * </p>
     * <p>
     * <code>keepcache=0</code>
     * </p>
     * <p>
     * <code>debuglevel=2</code>
     * </p>
     */
    private String configuration;

    /**
     * <p>
     * The name specified to identify the patch source.
     * </p>
     * 
     * @param name
     *        The name specified to identify the patch source.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name specified to identify the patch source.
     * </p>
     * 
     * @return The name specified to identify the patch source.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name specified to identify the patch source.
     * </p>
     * 
     * @param name
     *        The name specified to identify the patch source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchSource withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The specific operating system versions a patch repository applies to, such as "Ubuntu16.04",
     * "AmazonLinux2016.09", "RedhatEnterpriseLinux7.2" or "Suse12.7". For lists of supported product values, see
     * <a>PatchFilter</a>.
     * </p>
     * 
     * @return The specific operating system versions a patch repository applies to, such as "Ubuntu16.04",
     *         "AmazonLinux2016.09", "RedhatEnterpriseLinux7.2" or "Suse12.7". For lists of supported product values,
     *         see <a>PatchFilter</a>.
     */

    public java.util.List<String> getProducts() {
        if (products == null) {
            products = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return products;
    }

    /**
     * <p>
     * The specific operating system versions a patch repository applies to, such as "Ubuntu16.04",
     * "AmazonLinux2016.09", "RedhatEnterpriseLinux7.2" or "Suse12.7". For lists of supported product values, see
     * <a>PatchFilter</a>.
     * </p>
     * 
     * @param products
     *        The specific operating system versions a patch repository applies to, such as "Ubuntu16.04",
     *        "AmazonLinux2016.09", "RedhatEnterpriseLinux7.2" or "Suse12.7". For lists of supported product values, see
     *        <a>PatchFilter</a>.
     */

    public void setProducts(java.util.Collection<String> products) {
        if (products == null) {
            this.products = null;
            return;
        }

        this.products = new com.amazonaws.internal.SdkInternalList<String>(products);
    }

    /**
     * <p>
     * The specific operating system versions a patch repository applies to, such as "Ubuntu16.04",
     * "AmazonLinux2016.09", "RedhatEnterpriseLinux7.2" or "Suse12.7". For lists of supported product values, see
     * <a>PatchFilter</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProducts(java.util.Collection)} or {@link #withProducts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param products
     *        The specific operating system versions a patch repository applies to, such as "Ubuntu16.04",
     *        "AmazonLinux2016.09", "RedhatEnterpriseLinux7.2" or "Suse12.7". For lists of supported product values, see
     *        <a>PatchFilter</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchSource withProducts(String... products) {
        if (this.products == null) {
            setProducts(new com.amazonaws.internal.SdkInternalList<String>(products.length));
        }
        for (String ele : products) {
            this.products.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The specific operating system versions a patch repository applies to, such as "Ubuntu16.04",
     * "AmazonLinux2016.09", "RedhatEnterpriseLinux7.2" or "Suse12.7". For lists of supported product values, see
     * <a>PatchFilter</a>.
     * </p>
     * 
     * @param products
     *        The specific operating system versions a patch repository applies to, such as "Ubuntu16.04",
     *        "AmazonLinux2016.09", "RedhatEnterpriseLinux7.2" or "Suse12.7". For lists of supported product values, see
     *        <a>PatchFilter</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchSource withProducts(java.util.Collection<String> products) {
        setProducts(products);
        return this;
    }

    /**
     * <p>
     * The value of the yum repo configuration. For example:
     * </p>
     * <p>
     * <code>[main]</code>
     * </p>
     * <p>
     * <code>cachedir=/var/cache/yum/$basesearch$releasever</code>
     * </p>
     * <p>
     * <code>keepcache=0</code>
     * </p>
     * <p>
     * <code>debuglevel=2</code>
     * </p>
     * 
     * @param configuration
     *        The value of the yum repo configuration. For example:</p>
     *        <p>
     *        <code>[main]</code>
     *        </p>
     *        <p>
     *        <code>cachedir=/var/cache/yum/$basesearch$releasever</code>
     *        </p>
     *        <p>
     *        <code>keepcache=0</code>
     *        </p>
     *        <p>
     *        <code>debuglevel=2</code>
     */

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The value of the yum repo configuration. For example:
     * </p>
     * <p>
     * <code>[main]</code>
     * </p>
     * <p>
     * <code>cachedir=/var/cache/yum/$basesearch$releasever</code>
     * </p>
     * <p>
     * <code>keepcache=0</code>
     * </p>
     * <p>
     * <code>debuglevel=2</code>
     * </p>
     * 
     * @return The value of the yum repo configuration. For example:</p>
     *         <p>
     *         <code>[main]</code>
     *         </p>
     *         <p>
     *         <code>cachedir=/var/cache/yum/$basesearch$releasever</code>
     *         </p>
     *         <p>
     *         <code>keepcache=0</code>
     *         </p>
     *         <p>
     *         <code>debuglevel=2</code>
     */

    public String getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The value of the yum repo configuration. For example:
     * </p>
     * <p>
     * <code>[main]</code>
     * </p>
     * <p>
     * <code>cachedir=/var/cache/yum/$basesearch$releasever</code>
     * </p>
     * <p>
     * <code>keepcache=0</code>
     * </p>
     * <p>
     * <code>debuglevel=2</code>
     * </p>
     * 
     * @param configuration
     *        The value of the yum repo configuration. For example:</p>
     *        <p>
     *        <code>[main]</code>
     *        </p>
     *        <p>
     *        <code>cachedir=/var/cache/yum/$basesearch$releasever</code>
     *        </p>
     *        <p>
     *        <code>keepcache=0</code>
     *        </p>
     *        <p>
     *        <code>debuglevel=2</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchSource withConfiguration(String configuration) {
        setConfiguration(configuration);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getProducts() != null)
            sb.append("Products: ").append(getProducts()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PatchSource == false)
            return false;
        PatchSource other = (PatchSource) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProducts() == null ^ this.getProducts() == null)
            return false;
        if (other.getProducts() != null && other.getProducts().equals(this.getProducts()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProducts() == null) ? 0 : getProducts().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public PatchSource clone() {
        try {
            return (PatchSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.PatchSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
