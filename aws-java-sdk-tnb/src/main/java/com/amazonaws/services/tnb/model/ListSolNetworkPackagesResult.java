/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.tnb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ListSolNetworkPackages" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSolNetworkPackagesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Network packages. A network package is a .zip file in CSAR (Cloud Service Archive) format defines the function
     * packages you want to deploy and the Amazon Web Services infrastructure you want to deploy them on.
     * </p>
     */
    private java.util.List<ListSolNetworkPackageInfo> networkPackages;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Network packages. A network package is a .zip file in CSAR (Cloud Service Archive) format defines the function
     * packages you want to deploy and the Amazon Web Services infrastructure you want to deploy them on.
     * </p>
     * 
     * @return Network packages. A network package is a .zip file in CSAR (Cloud Service Archive) format defines the
     *         function packages you want to deploy and the Amazon Web Services infrastructure you want to deploy them
     *         on.
     */

    public java.util.List<ListSolNetworkPackageInfo> getNetworkPackages() {
        return networkPackages;
    }

    /**
     * <p>
     * Network packages. A network package is a .zip file in CSAR (Cloud Service Archive) format defines the function
     * packages you want to deploy and the Amazon Web Services infrastructure you want to deploy them on.
     * </p>
     * 
     * @param networkPackages
     *        Network packages. A network package is a .zip file in CSAR (Cloud Service Archive) format defines the
     *        function packages you want to deploy and the Amazon Web Services infrastructure you want to deploy them
     *        on.
     */

    public void setNetworkPackages(java.util.Collection<ListSolNetworkPackageInfo> networkPackages) {
        if (networkPackages == null) {
            this.networkPackages = null;
            return;
        }

        this.networkPackages = new java.util.ArrayList<ListSolNetworkPackageInfo>(networkPackages);
    }

    /**
     * <p>
     * Network packages. A network package is a .zip file in CSAR (Cloud Service Archive) format defines the function
     * packages you want to deploy and the Amazon Web Services infrastructure you want to deploy them on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkPackages(java.util.Collection)} or {@link #withNetworkPackages(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param networkPackages
     *        Network packages. A network package is a .zip file in CSAR (Cloud Service Archive) format defines the
     *        function packages you want to deploy and the Amazon Web Services infrastructure you want to deploy them
     *        on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolNetworkPackagesResult withNetworkPackages(ListSolNetworkPackageInfo... networkPackages) {
        if (this.networkPackages == null) {
            setNetworkPackages(new java.util.ArrayList<ListSolNetworkPackageInfo>(networkPackages.length));
        }
        for (ListSolNetworkPackageInfo ele : networkPackages) {
            this.networkPackages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Network packages. A network package is a .zip file in CSAR (Cloud Service Archive) format defines the function
     * packages you want to deploy and the Amazon Web Services infrastructure you want to deploy them on.
     * </p>
     * 
     * @param networkPackages
     *        Network packages. A network package is a .zip file in CSAR (Cloud Service Archive) format defines the
     *        function packages you want to deploy and the Amazon Web Services infrastructure you want to deploy them
     *        on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolNetworkPackagesResult withNetworkPackages(java.util.Collection<ListSolNetworkPackageInfo> networkPackages) {
        setNetworkPackages(networkPackages);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolNetworkPackagesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getNetworkPackages() != null)
            sb.append("NetworkPackages: ").append(getNetworkPackages()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSolNetworkPackagesResult == false)
            return false;
        ListSolNetworkPackagesResult other = (ListSolNetworkPackagesResult) obj;
        if (other.getNetworkPackages() == null ^ this.getNetworkPackages() == null)
            return false;
        if (other.getNetworkPackages() != null && other.getNetworkPackages().equals(this.getNetworkPackages()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkPackages() == null) ? 0 : getNetworkPackages().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSolNetworkPackagesResult clone() {
        try {
            return (ListSolNetworkPackagesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
