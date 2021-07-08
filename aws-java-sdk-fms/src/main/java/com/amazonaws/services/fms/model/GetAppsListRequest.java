/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetAppsList" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAppsListRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Firewall Manager applications list that you want the details for.
     * </p>
     */
    private String listId;
    /**
     * <p>
     * Specifies whether the list to retrieve is a default list owned by Firewall Manager.
     * </p>
     */
    private Boolean defaultList;

    /**
     * <p>
     * The ID of the Firewall Manager applications list that you want the details for.
     * </p>
     * 
     * @param listId
     *        The ID of the Firewall Manager applications list that you want the details for.
     */

    public void setListId(String listId) {
        this.listId = listId;
    }

    /**
     * <p>
     * The ID of the Firewall Manager applications list that you want the details for.
     * </p>
     * 
     * @return The ID of the Firewall Manager applications list that you want the details for.
     */

    public String getListId() {
        return this.listId;
    }

    /**
     * <p>
     * The ID of the Firewall Manager applications list that you want the details for.
     * </p>
     * 
     * @param listId
     *        The ID of the Firewall Manager applications list that you want the details for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAppsListRequest withListId(String listId) {
        setListId(listId);
        return this;
    }

    /**
     * <p>
     * Specifies whether the list to retrieve is a default list owned by Firewall Manager.
     * </p>
     * 
     * @param defaultList
     *        Specifies whether the list to retrieve is a default list owned by Firewall Manager.
     */

    public void setDefaultList(Boolean defaultList) {
        this.defaultList = defaultList;
    }

    /**
     * <p>
     * Specifies whether the list to retrieve is a default list owned by Firewall Manager.
     * </p>
     * 
     * @return Specifies whether the list to retrieve is a default list owned by Firewall Manager.
     */

    public Boolean getDefaultList() {
        return this.defaultList;
    }

    /**
     * <p>
     * Specifies whether the list to retrieve is a default list owned by Firewall Manager.
     * </p>
     * 
     * @param defaultList
     *        Specifies whether the list to retrieve is a default list owned by Firewall Manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAppsListRequest withDefaultList(Boolean defaultList) {
        setDefaultList(defaultList);
        return this;
    }

    /**
     * <p>
     * Specifies whether the list to retrieve is a default list owned by Firewall Manager.
     * </p>
     * 
     * @return Specifies whether the list to retrieve is a default list owned by Firewall Manager.
     */

    public Boolean isDefaultList() {
        return this.defaultList;
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
        if (getListId() != null)
            sb.append("ListId: ").append(getListId()).append(",");
        if (getDefaultList() != null)
            sb.append("DefaultList: ").append(getDefaultList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAppsListRequest == false)
            return false;
        GetAppsListRequest other = (GetAppsListRequest) obj;
        if (other.getListId() == null ^ this.getListId() == null)
            return false;
        if (other.getListId() != null && other.getListId().equals(this.getListId()) == false)
            return false;
        if (other.getDefaultList() == null ^ this.getDefaultList() == null)
            return false;
        if (other.getDefaultList() != null && other.getDefaultList().equals(this.getDefaultList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getListId() == null) ? 0 : getListId().hashCode());
        hashCode = prime * hashCode + ((getDefaultList() == null) ? 0 : getDefaultList().hashCode());
        return hashCode;
    }

    @Override
    public GetAppsListRequest clone() {
        return (GetAppsListRequest) super.clone();
    }

}
