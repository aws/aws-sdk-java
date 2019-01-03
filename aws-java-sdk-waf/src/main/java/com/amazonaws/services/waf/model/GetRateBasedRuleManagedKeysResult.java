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
package com.amazonaws.services.waf.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetRateBasedRuleManagedKeys"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRateBasedRuleManagedKeysResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of IP addresses that currently are blocked by the specified <a>RateBasedRule</a>.
     * </p>
     */
    private java.util.List<String> managedKeys;
    /**
     * <p>
     * A null value and not currently used.
     * </p>
     */
    private String nextMarker;

    /**
     * <p>
     * An array of IP addresses that currently are blocked by the specified <a>RateBasedRule</a>.
     * </p>
     * 
     * @return An array of IP addresses that currently are blocked by the specified <a>RateBasedRule</a>.
     */

    public java.util.List<String> getManagedKeys() {
        return managedKeys;
    }

    /**
     * <p>
     * An array of IP addresses that currently are blocked by the specified <a>RateBasedRule</a>.
     * </p>
     * 
     * @param managedKeys
     *        An array of IP addresses that currently are blocked by the specified <a>RateBasedRule</a>.
     */

    public void setManagedKeys(java.util.Collection<String> managedKeys) {
        if (managedKeys == null) {
            this.managedKeys = null;
            return;
        }

        this.managedKeys = new java.util.ArrayList<String>(managedKeys);
    }

    /**
     * <p>
     * An array of IP addresses that currently are blocked by the specified <a>RateBasedRule</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setManagedKeys(java.util.Collection)} or {@link #withManagedKeys(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param managedKeys
     *        An array of IP addresses that currently are blocked by the specified <a>RateBasedRule</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRateBasedRuleManagedKeysResult withManagedKeys(String... managedKeys) {
        if (this.managedKeys == null) {
            setManagedKeys(new java.util.ArrayList<String>(managedKeys.length));
        }
        for (String ele : managedKeys) {
            this.managedKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of IP addresses that currently are blocked by the specified <a>RateBasedRule</a>.
     * </p>
     * 
     * @param managedKeys
     *        An array of IP addresses that currently are blocked by the specified <a>RateBasedRule</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRateBasedRuleManagedKeysResult withManagedKeys(java.util.Collection<String> managedKeys) {
        setManagedKeys(managedKeys);
        return this;
    }

    /**
     * <p>
     * A null value and not currently used.
     * </p>
     * 
     * @param nextMarker
     *        A null value and not currently used.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * A null value and not currently used.
     * </p>
     * 
     * @return A null value and not currently used.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * A null value and not currently used.
     * </p>
     * 
     * @param nextMarker
     *        A null value and not currently used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRateBasedRuleManagedKeysResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
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
        if (getManagedKeys() != null)
            sb.append("ManagedKeys: ").append(getManagedKeys()).append(",");
        if (getNextMarker() != null)
            sb.append("NextMarker: ").append(getNextMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRateBasedRuleManagedKeysResult == false)
            return false;
        GetRateBasedRuleManagedKeysResult other = (GetRateBasedRuleManagedKeysResult) obj;
        if (other.getManagedKeys() == null ^ this.getManagedKeys() == null)
            return false;
        if (other.getManagedKeys() != null && other.getManagedKeys().equals(this.getManagedKeys()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getManagedKeys() == null) ? 0 : getManagedKeys().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        return hashCode;
    }

    @Override
    public GetRateBasedRuleManagedKeysResult clone() {
        try {
            return (GetRateBasedRuleManagedKeysResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
