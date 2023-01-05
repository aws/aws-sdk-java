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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeAddonVersions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAddonVersionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Kubernetes versions that you can use the add-on with.
     * </p>
     */
    private String kubernetesVersion;
    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>DescribeAddonVersionsRequest</code>
     * where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues
     * from the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is used only to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     */
    private String nextToken;
    /**
     * <p>
     * The name of the add-on. The name must match one of the names returned by <a
     * href="https://docs.aws.amazon.com/eks/latest/APIReference/API_ListAddons.html"> <code>ListAddons</code> </a>.
     * </p>
     */
    private String addonName;
    /**
     * <p>
     * The type of the add-on. For valid <code>types</code>, don't specify a value for this property.
     * </p>
     */
    private java.util.List<String> types;
    /**
     * <p>
     * The publisher of the add-on. For valid <code>publishers</code>, don't specify a value for this property.
     * </p>
     */
    private java.util.List<String> publishers;
    /**
     * <p>
     * The owner of the add-on. For valid <code>owners</code>, don't specify a value for this property.
     * </p>
     */
    private java.util.List<String> owners;

    /**
     * <p>
     * The Kubernetes versions that you can use the add-on with.
     * </p>
     * 
     * @param kubernetesVersion
     *        The Kubernetes versions that you can use the add-on with.
     */

    public void setKubernetesVersion(String kubernetesVersion) {
        this.kubernetesVersion = kubernetesVersion;
    }

    /**
     * <p>
     * The Kubernetes versions that you can use the add-on with.
     * </p>
     * 
     * @return The Kubernetes versions that you can use the add-on with.
     */

    public String getKubernetesVersion() {
        return this.kubernetesVersion;
    }

    /**
     * <p>
     * The Kubernetes versions that you can use the add-on with.
     * </p>
     * 
     * @param kubernetesVersion
     *        The Kubernetes versions that you can use the add-on with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAddonVersionsRequest withKubernetesVersion(String kubernetesVersion) {
        setKubernetesVersion(kubernetesVersion);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @return The maximum number of results to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAddonVersionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>DescribeAddonVersionsRequest</code>
     * where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues
     * from the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is used only to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated
     *        <code>DescribeAddonVersionsRequest</code> where <code>maxResults</code> was used and the results exceeded
     *        the value of that parameter. Pagination continues from the end of the previous results that returned the
     *        <code>nextToken</code> value.</p> <note>
     *        <p>
     *        This token should be treated as an opaque identifier that is used only to retrieve the next items in a
     *        list and not for other programmatic purposes.
     *        </p>
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>DescribeAddonVersionsRequest</code>
     * where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues
     * from the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is used only to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @return The <code>nextToken</code> value returned from a previous paginated
     *         <code>DescribeAddonVersionsRequest</code> where <code>maxResults</code> was used and the results exceeded
     *         the value of that parameter. Pagination continues from the end of the previous results that returned the
     *         <code>nextToken</code> value.</p> <note>
     *         <p>
     *         This token should be treated as an opaque identifier that is used only to retrieve the next items in a
     *         list and not for other programmatic purposes.
     *         </p>
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>DescribeAddonVersionsRequest</code>
     * where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues
     * from the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is used only to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated
     *        <code>DescribeAddonVersionsRequest</code> where <code>maxResults</code> was used and the results exceeded
     *        the value of that parameter. Pagination continues from the end of the previous results that returned the
     *        <code>nextToken</code> value.</p> <note>
     *        <p>
     *        This token should be treated as an opaque identifier that is used only to retrieve the next items in a
     *        list and not for other programmatic purposes.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAddonVersionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The name of the add-on. The name must match one of the names returned by <a
     * href="https://docs.aws.amazon.com/eks/latest/APIReference/API_ListAddons.html"> <code>ListAddons</code> </a>.
     * </p>
     * 
     * @param addonName
     *        The name of the add-on. The name must match one of the names returned by <a
     *        href="https://docs.aws.amazon.com/eks/latest/APIReference/API_ListAddons.html"> <code>ListAddons</code>
     *        </a>.
     */

    public void setAddonName(String addonName) {
        this.addonName = addonName;
    }

    /**
     * <p>
     * The name of the add-on. The name must match one of the names returned by <a
     * href="https://docs.aws.amazon.com/eks/latest/APIReference/API_ListAddons.html"> <code>ListAddons</code> </a>.
     * </p>
     * 
     * @return The name of the add-on. The name must match one of the names returned by <a
     *         href="https://docs.aws.amazon.com/eks/latest/APIReference/API_ListAddons.html"> <code>ListAddons</code>
     *         </a>.
     */

    public String getAddonName() {
        return this.addonName;
    }

    /**
     * <p>
     * The name of the add-on. The name must match one of the names returned by <a
     * href="https://docs.aws.amazon.com/eks/latest/APIReference/API_ListAddons.html"> <code>ListAddons</code> </a>.
     * </p>
     * 
     * @param addonName
     *        The name of the add-on. The name must match one of the names returned by <a
     *        href="https://docs.aws.amazon.com/eks/latest/APIReference/API_ListAddons.html"> <code>ListAddons</code>
     *        </a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAddonVersionsRequest withAddonName(String addonName) {
        setAddonName(addonName);
        return this;
    }

    /**
     * <p>
     * The type of the add-on. For valid <code>types</code>, don't specify a value for this property.
     * </p>
     * 
     * @return The type of the add-on. For valid <code>types</code>, don't specify a value for this property.
     */

    public java.util.List<String> getTypes() {
        return types;
    }

    /**
     * <p>
     * The type of the add-on. For valid <code>types</code>, don't specify a value for this property.
     * </p>
     * 
     * @param types
     *        The type of the add-on. For valid <code>types</code>, don't specify a value for this property.
     */

    public void setTypes(java.util.Collection<String> types) {
        if (types == null) {
            this.types = null;
            return;
        }

        this.types = new java.util.ArrayList<String>(types);
    }

    /**
     * <p>
     * The type of the add-on. For valid <code>types</code>, don't specify a value for this property.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTypes(java.util.Collection)} or {@link #withTypes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param types
     *        The type of the add-on. For valid <code>types</code>, don't specify a value for this property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAddonVersionsRequest withTypes(String... types) {
        if (this.types == null) {
            setTypes(new java.util.ArrayList<String>(types.length));
        }
        for (String ele : types) {
            this.types.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The type of the add-on. For valid <code>types</code>, don't specify a value for this property.
     * </p>
     * 
     * @param types
     *        The type of the add-on. For valid <code>types</code>, don't specify a value for this property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAddonVersionsRequest withTypes(java.util.Collection<String> types) {
        setTypes(types);
        return this;
    }

    /**
     * <p>
     * The publisher of the add-on. For valid <code>publishers</code>, don't specify a value for this property.
     * </p>
     * 
     * @return The publisher of the add-on. For valid <code>publishers</code>, don't specify a value for this property.
     */

    public java.util.List<String> getPublishers() {
        return publishers;
    }

    /**
     * <p>
     * The publisher of the add-on. For valid <code>publishers</code>, don't specify a value for this property.
     * </p>
     * 
     * @param publishers
     *        The publisher of the add-on. For valid <code>publishers</code>, don't specify a value for this property.
     */

    public void setPublishers(java.util.Collection<String> publishers) {
        if (publishers == null) {
            this.publishers = null;
            return;
        }

        this.publishers = new java.util.ArrayList<String>(publishers);
    }

    /**
     * <p>
     * The publisher of the add-on. For valid <code>publishers</code>, don't specify a value for this property.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPublishers(java.util.Collection)} or {@link #withPublishers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param publishers
     *        The publisher of the add-on. For valid <code>publishers</code>, don't specify a value for this property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAddonVersionsRequest withPublishers(String... publishers) {
        if (this.publishers == null) {
            setPublishers(new java.util.ArrayList<String>(publishers.length));
        }
        for (String ele : publishers) {
            this.publishers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The publisher of the add-on. For valid <code>publishers</code>, don't specify a value for this property.
     * </p>
     * 
     * @param publishers
     *        The publisher of the add-on. For valid <code>publishers</code>, don't specify a value for this property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAddonVersionsRequest withPublishers(java.util.Collection<String> publishers) {
        setPublishers(publishers);
        return this;
    }

    /**
     * <p>
     * The owner of the add-on. For valid <code>owners</code>, don't specify a value for this property.
     * </p>
     * 
     * @return The owner of the add-on. For valid <code>owners</code>, don't specify a value for this property.
     */

    public java.util.List<String> getOwners() {
        return owners;
    }

    /**
     * <p>
     * The owner of the add-on. For valid <code>owners</code>, don't specify a value for this property.
     * </p>
     * 
     * @param owners
     *        The owner of the add-on. For valid <code>owners</code>, don't specify a value for this property.
     */

    public void setOwners(java.util.Collection<String> owners) {
        if (owners == null) {
            this.owners = null;
            return;
        }

        this.owners = new java.util.ArrayList<String>(owners);
    }

    /**
     * <p>
     * The owner of the add-on. For valid <code>owners</code>, don't specify a value for this property.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOwners(java.util.Collection)} or {@link #withOwners(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param owners
     *        The owner of the add-on. For valid <code>owners</code>, don't specify a value for this property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAddonVersionsRequest withOwners(String... owners) {
        if (this.owners == null) {
            setOwners(new java.util.ArrayList<String>(owners.length));
        }
        for (String ele : owners) {
            this.owners.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The owner of the add-on. For valid <code>owners</code>, don't specify a value for this property.
     * </p>
     * 
     * @param owners
     *        The owner of the add-on. For valid <code>owners</code>, don't specify a value for this property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAddonVersionsRequest withOwners(java.util.Collection<String> owners) {
        setOwners(owners);
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
        if (getKubernetesVersion() != null)
            sb.append("KubernetesVersion: ").append(getKubernetesVersion()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getAddonName() != null)
            sb.append("AddonName: ").append(getAddonName()).append(",");
        if (getTypes() != null)
            sb.append("Types: ").append(getTypes()).append(",");
        if (getPublishers() != null)
            sb.append("Publishers: ").append(getPublishers()).append(",");
        if (getOwners() != null)
            sb.append("Owners: ").append(getOwners());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAddonVersionsRequest == false)
            return false;
        DescribeAddonVersionsRequest other = (DescribeAddonVersionsRequest) obj;
        if (other.getKubernetesVersion() == null ^ this.getKubernetesVersion() == null)
            return false;
        if (other.getKubernetesVersion() != null && other.getKubernetesVersion().equals(this.getKubernetesVersion()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getAddonName() == null ^ this.getAddonName() == null)
            return false;
        if (other.getAddonName() != null && other.getAddonName().equals(this.getAddonName()) == false)
            return false;
        if (other.getTypes() == null ^ this.getTypes() == null)
            return false;
        if (other.getTypes() != null && other.getTypes().equals(this.getTypes()) == false)
            return false;
        if (other.getPublishers() == null ^ this.getPublishers() == null)
            return false;
        if (other.getPublishers() != null && other.getPublishers().equals(this.getPublishers()) == false)
            return false;
        if (other.getOwners() == null ^ this.getOwners() == null)
            return false;
        if (other.getOwners() != null && other.getOwners().equals(this.getOwners()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKubernetesVersion() == null) ? 0 : getKubernetesVersion().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getAddonName() == null) ? 0 : getAddonName().hashCode());
        hashCode = prime * hashCode + ((getTypes() == null) ? 0 : getTypes().hashCode());
        hashCode = prime * hashCode + ((getPublishers() == null) ? 0 : getPublishers().hashCode());
        hashCode = prime * hashCode + ((getOwners() == null) ? 0 : getOwners().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAddonVersionsRequest clone() {
        return (DescribeAddonVersionsRequest) super.clone();
    }

}
