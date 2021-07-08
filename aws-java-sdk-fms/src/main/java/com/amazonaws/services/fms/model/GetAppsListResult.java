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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetAppsList" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAppsListResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the specified Firewall Manager applications list.
     * </p>
     */
    private AppsListData appsList;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the applications list.
     * </p>
     */
    private String appsListArn;

    /**
     * <p>
     * Information about the specified Firewall Manager applications list.
     * </p>
     * 
     * @param appsList
     *        Information about the specified Firewall Manager applications list.
     */

    public void setAppsList(AppsListData appsList) {
        this.appsList = appsList;
    }

    /**
     * <p>
     * Information about the specified Firewall Manager applications list.
     * </p>
     * 
     * @return Information about the specified Firewall Manager applications list.
     */

    public AppsListData getAppsList() {
        return this.appsList;
    }

    /**
     * <p>
     * Information about the specified Firewall Manager applications list.
     * </p>
     * 
     * @param appsList
     *        Information about the specified Firewall Manager applications list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAppsListResult withAppsList(AppsListData appsList) {
        setAppsList(appsList);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the applications list.
     * </p>
     * 
     * @param appsListArn
     *        The Amazon Resource Name (ARN) of the applications list.
     */

    public void setAppsListArn(String appsListArn) {
        this.appsListArn = appsListArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the applications list.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the applications list.
     */

    public String getAppsListArn() {
        return this.appsListArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the applications list.
     * </p>
     * 
     * @param appsListArn
     *        The Amazon Resource Name (ARN) of the applications list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAppsListResult withAppsListArn(String appsListArn) {
        setAppsListArn(appsListArn);
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
        if (getAppsList() != null)
            sb.append("AppsList: ").append(getAppsList()).append(",");
        if (getAppsListArn() != null)
            sb.append("AppsListArn: ").append(getAppsListArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAppsListResult == false)
            return false;
        GetAppsListResult other = (GetAppsListResult) obj;
        if (other.getAppsList() == null ^ this.getAppsList() == null)
            return false;
        if (other.getAppsList() != null && other.getAppsList().equals(this.getAppsList()) == false)
            return false;
        if (other.getAppsListArn() == null ^ this.getAppsListArn() == null)
            return false;
        if (other.getAppsListArn() != null && other.getAppsListArn().equals(this.getAppsListArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppsList() == null) ? 0 : getAppsList().hashCode());
        hashCode = prime * hashCode + ((getAppsListArn() == null) ? 0 : getAppsListArn().hashCode());
        return hashCode;
    }

    @Override
    public GetAppsListResult clone() {
        try {
            return (GetAppsListResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
