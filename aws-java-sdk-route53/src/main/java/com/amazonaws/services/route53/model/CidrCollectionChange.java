/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A complex type that contains information about the CIDR collection change.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CidrCollectionChange" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CidrCollectionChange implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the location that is associated with the CIDR collection.
     * </p>
     */
    private String locationName;
    /**
     * <p>
     * CIDR collection change action.
     * </p>
     */
    private String action;
    /**
     * <p>
     * List of CIDR blocks.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> cidrList;

    /**
     * <p>
     * Name of the location that is associated with the CIDR collection.
     * </p>
     * 
     * @param locationName
     *        Name of the location that is associated with the CIDR collection.
     */

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    /**
     * <p>
     * Name of the location that is associated with the CIDR collection.
     * </p>
     * 
     * @return Name of the location that is associated with the CIDR collection.
     */

    public String getLocationName() {
        return this.locationName;
    }

    /**
     * <p>
     * Name of the location that is associated with the CIDR collection.
     * </p>
     * 
     * @param locationName
     *        Name of the location that is associated with the CIDR collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CidrCollectionChange withLocationName(String locationName) {
        setLocationName(locationName);
        return this;
    }

    /**
     * <p>
     * CIDR collection change action.
     * </p>
     * 
     * @param action
     *        CIDR collection change action.
     * @see CidrCollectionChangeAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * CIDR collection change action.
     * </p>
     * 
     * @return CIDR collection change action.
     * @see CidrCollectionChangeAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * CIDR collection change action.
     * </p>
     * 
     * @param action
     *        CIDR collection change action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CidrCollectionChangeAction
     */

    public CidrCollectionChange withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * CIDR collection change action.
     * </p>
     * 
     * @param action
     *        CIDR collection change action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CidrCollectionChangeAction
     */

    public CidrCollectionChange withAction(CidrCollectionChangeAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * List of CIDR blocks.
     * </p>
     * 
     * @return List of CIDR blocks.
     */

    public java.util.List<String> getCidrList() {
        if (cidrList == null) {
            cidrList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return cidrList;
    }

    /**
     * <p>
     * List of CIDR blocks.
     * </p>
     * 
     * @param cidrList
     *        List of CIDR blocks.
     */

    public void setCidrList(java.util.Collection<String> cidrList) {
        if (cidrList == null) {
            this.cidrList = null;
            return;
        }

        this.cidrList = new com.amazonaws.internal.SdkInternalList<String>(cidrList);
    }

    /**
     * <p>
     * List of CIDR blocks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCidrList(java.util.Collection)} or {@link #withCidrList(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param cidrList
     *        List of CIDR blocks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CidrCollectionChange withCidrList(String... cidrList) {
        if (this.cidrList == null) {
            setCidrList(new com.amazonaws.internal.SdkInternalList<String>(cidrList.length));
        }
        for (String ele : cidrList) {
            this.cidrList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of CIDR blocks.
     * </p>
     * 
     * @param cidrList
     *        List of CIDR blocks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CidrCollectionChange withCidrList(java.util.Collection<String> cidrList) {
        setCidrList(cidrList);
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
        if (getLocationName() != null)
            sb.append("LocationName: ").append(getLocationName()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getCidrList() != null)
            sb.append("CidrList: ").append(getCidrList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CidrCollectionChange == false)
            return false;
        CidrCollectionChange other = (CidrCollectionChange) obj;
        if (other.getLocationName() == null ^ this.getLocationName() == null)
            return false;
        if (other.getLocationName() != null && other.getLocationName().equals(this.getLocationName()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getCidrList() == null ^ this.getCidrList() == null)
            return false;
        if (other.getCidrList() != null && other.getCidrList().equals(this.getCidrList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocationName() == null) ? 0 : getLocationName().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getCidrList() == null) ? 0 : getCidrList().hashCode());
        return hashCode;
    }

    @Override
    public CidrCollectionChange clone() {
        try {
            return (CidrCollectionChange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
