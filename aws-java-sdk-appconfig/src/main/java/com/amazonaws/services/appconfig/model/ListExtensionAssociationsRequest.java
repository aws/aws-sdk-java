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
package com.amazonaws.services.appconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/ListExtensionAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListExtensionAssociationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of an application, configuration profile, or environment.
     * </p>
     */
    private String resourceIdentifier;
    /**
     * <p>
     * The name, the ID, or the Amazon Resource Name (ARN) of the extension.
     * </p>
     */
    private String extensionIdentifier;
    /**
     * <p>
     * The version number for the extension defined in the association.
     * </p>
     */
    private Integer extensionVersionNumber;
    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results or pass null to get the first set of
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ARN of an application, configuration profile, or environment.
     * </p>
     * 
     * @param resourceIdentifier
     *        The ARN of an application, configuration profile, or environment.
     */

    public void setResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    /**
     * <p>
     * The ARN of an application, configuration profile, or environment.
     * </p>
     * 
     * @return The ARN of an application, configuration profile, or environment.
     */

    public String getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    /**
     * <p>
     * The ARN of an application, configuration profile, or environment.
     * </p>
     * 
     * @param resourceIdentifier
     *        The ARN of an application, configuration profile, or environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExtensionAssociationsRequest withResourceIdentifier(String resourceIdentifier) {
        setResourceIdentifier(resourceIdentifier);
        return this;
    }

    /**
     * <p>
     * The name, the ID, or the Amazon Resource Name (ARN) of the extension.
     * </p>
     * 
     * @param extensionIdentifier
     *        The name, the ID, or the Amazon Resource Name (ARN) of the extension.
     */

    public void setExtensionIdentifier(String extensionIdentifier) {
        this.extensionIdentifier = extensionIdentifier;
    }

    /**
     * <p>
     * The name, the ID, or the Amazon Resource Name (ARN) of the extension.
     * </p>
     * 
     * @return The name, the ID, or the Amazon Resource Name (ARN) of the extension.
     */

    public String getExtensionIdentifier() {
        return this.extensionIdentifier;
    }

    /**
     * <p>
     * The name, the ID, or the Amazon Resource Name (ARN) of the extension.
     * </p>
     * 
     * @param extensionIdentifier
     *        The name, the ID, or the Amazon Resource Name (ARN) of the extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExtensionAssociationsRequest withExtensionIdentifier(String extensionIdentifier) {
        setExtensionIdentifier(extensionIdentifier);
        return this;
    }

    /**
     * <p>
     * The version number for the extension defined in the association.
     * </p>
     * 
     * @param extensionVersionNumber
     *        The version number for the extension defined in the association.
     */

    public void setExtensionVersionNumber(Integer extensionVersionNumber) {
        this.extensionVersionNumber = extensionVersionNumber;
    }

    /**
     * <p>
     * The version number for the extension defined in the association.
     * </p>
     * 
     * @return The version number for the extension defined in the association.
     */

    public Integer getExtensionVersionNumber() {
        return this.extensionVersionNumber;
    }

    /**
     * <p>
     * The version number for the extension defined in the association.
     * </p>
     * 
     * @param extensionVersionNumber
     *        The version number for the extension defined in the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExtensionAssociationsRequest withExtensionVersionNumber(Integer extensionVersionNumber) {
        setExtensionVersionNumber(extensionVersionNumber);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this call. The call also returns a token that you can specify in
     *        a subsequent call to get the next set of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @return The maximum number of items to return for this call. The call also returns a token that you can specify
     *         in a subsequent call to get the next set of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this call. The call also returns a token that you can specify in
     *        a subsequent call to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExtensionAssociationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results or pass null to get the first set of
     * results.
     * </p>
     * 
     * @param nextToken
     *        A token to start the list. Use this token to get the next set of results or pass null to get the first set
     *        of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results or pass null to get the first set of
     * results.
     * </p>
     * 
     * @return A token to start the list. Use this token to get the next set of results or pass null to get the first
     *         set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results or pass null to get the first set of
     * results.
     * </p>
     * 
     * @param nextToken
     *        A token to start the list. Use this token to get the next set of results or pass null to get the first set
     *        of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExtensionAssociationsRequest withNextToken(String nextToken) {
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
        if (getResourceIdentifier() != null)
            sb.append("ResourceIdentifier: ").append(getResourceIdentifier()).append(",");
        if (getExtensionIdentifier() != null)
            sb.append("ExtensionIdentifier: ").append(getExtensionIdentifier()).append(",");
        if (getExtensionVersionNumber() != null)
            sb.append("ExtensionVersionNumber: ").append(getExtensionVersionNumber()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListExtensionAssociationsRequest == false)
            return false;
        ListExtensionAssociationsRequest other = (ListExtensionAssociationsRequest) obj;
        if (other.getResourceIdentifier() == null ^ this.getResourceIdentifier() == null)
            return false;
        if (other.getResourceIdentifier() != null && other.getResourceIdentifier().equals(this.getResourceIdentifier()) == false)
            return false;
        if (other.getExtensionIdentifier() == null ^ this.getExtensionIdentifier() == null)
            return false;
        if (other.getExtensionIdentifier() != null && other.getExtensionIdentifier().equals(this.getExtensionIdentifier()) == false)
            return false;
        if (other.getExtensionVersionNumber() == null ^ this.getExtensionVersionNumber() == null)
            return false;
        if (other.getExtensionVersionNumber() != null && other.getExtensionVersionNumber().equals(this.getExtensionVersionNumber()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getResourceIdentifier() == null) ? 0 : getResourceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getExtensionIdentifier() == null) ? 0 : getExtensionIdentifier().hashCode());
        hashCode = prime * hashCode + ((getExtensionVersionNumber() == null) ? 0 : getExtensionVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListExtensionAssociationsRequest clone() {
        return (ListExtensionAssociationsRequest) super.clone();
    }

}
