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
package com.amazonaws.services.resourcegroupstaggingapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/UntagResources"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UntagResourcesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of ARNs. An ARN (Amazon Resource Name) uniquely identifies a resource. You can specify a minimum of 1 and
     * a maximum of 20 ARNs (resources) to untag. An ARN can be set to a maximum of 1600 characters. For more
     * information, see <a href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     */
    private java.util.List<String> resourceARNList;
    /**
     * <p>
     * A list of the tag keys that you want to remove from the specified resources.
     * </p>
     */
    private java.util.List<String> tagKeys;

    /**
     * <p>
     * A list of ARNs. An ARN (Amazon Resource Name) uniquely identifies a resource. You can specify a minimum of 1 and
     * a maximum of 20 ARNs (resources) to untag. An ARN can be set to a maximum of 1600 characters. For more
     * information, see <a href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return A list of ARNs. An ARN (Amazon Resource Name) uniquely identifies a resource. You can specify a minimum
     *         of 1 and a maximum of 20 ARNs (resources) to untag. An ARN can be set to a maximum of 1600 characters.
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     */

    public java.util.List<String> getResourceARNList() {
        return resourceARNList;
    }

    /**
     * <p>
     * A list of ARNs. An ARN (Amazon Resource Name) uniquely identifies a resource. You can specify a minimum of 1 and
     * a maximum of 20 ARNs (resources) to untag. An ARN can be set to a maximum of 1600 characters. For more
     * information, see <a href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param resourceARNList
     *        A list of ARNs. An ARN (Amazon Resource Name) uniquely identifies a resource. You can specify a minimum of
     *        1 and a maximum of 20 ARNs (resources) to untag. An ARN can be set to a maximum of 1600 characters. For
     *        more information, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     */

    public void setResourceARNList(java.util.Collection<String> resourceARNList) {
        if (resourceARNList == null) {
            this.resourceARNList = null;
            return;
        }

        this.resourceARNList = new java.util.ArrayList<String>(resourceARNList);
    }

    /**
     * <p>
     * A list of ARNs. An ARN (Amazon Resource Name) uniquely identifies a resource. You can specify a minimum of 1 and
     * a maximum of 20 ARNs (resources) to untag. An ARN can be set to a maximum of 1600 characters. For more
     * information, see <a href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceARNList(java.util.Collection)} or {@link #withResourceARNList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param resourceARNList
     *        A list of ARNs. An ARN (Amazon Resource Name) uniquely identifies a resource. You can specify a minimum of
     *        1 and a maximum of 20 ARNs (resources) to untag. An ARN can be set to a maximum of 1600 characters. For
     *        more information, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagResourcesRequest withResourceARNList(String... resourceARNList) {
        if (this.resourceARNList == null) {
            setResourceARNList(new java.util.ArrayList<String>(resourceARNList.length));
        }
        for (String ele : resourceARNList) {
            this.resourceARNList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of ARNs. An ARN (Amazon Resource Name) uniquely identifies a resource. You can specify a minimum of 1 and
     * a maximum of 20 ARNs (resources) to untag. An ARN can be set to a maximum of 1600 characters. For more
     * information, see <a href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param resourceARNList
     *        A list of ARNs. An ARN (Amazon Resource Name) uniquely identifies a resource. You can specify a minimum of
     *        1 and a maximum of 20 ARNs (resources) to untag. An ARN can be set to a maximum of 1600 characters. For
     *        more information, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagResourcesRequest withResourceARNList(java.util.Collection<String> resourceARNList) {
        setResourceARNList(resourceARNList);
        return this;
    }

    /**
     * <p>
     * A list of the tag keys that you want to remove from the specified resources.
     * </p>
     * 
     * @return A list of the tag keys that you want to remove from the specified resources.
     */

    public java.util.List<String> getTagKeys() {
        return tagKeys;
    }

    /**
     * <p>
     * A list of the tag keys that you want to remove from the specified resources.
     * </p>
     * 
     * @param tagKeys
     *        A list of the tag keys that you want to remove from the specified resources.
     */

    public void setTagKeys(java.util.Collection<String> tagKeys) {
        if (tagKeys == null) {
            this.tagKeys = null;
            return;
        }

        this.tagKeys = new java.util.ArrayList<String>(tagKeys);
    }

    /**
     * <p>
     * A list of the tag keys that you want to remove from the specified resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagKeys(java.util.Collection)} or {@link #withTagKeys(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tagKeys
     *        A list of the tag keys that you want to remove from the specified resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagResourcesRequest withTagKeys(String... tagKeys) {
        if (this.tagKeys == null) {
            setTagKeys(new java.util.ArrayList<String>(tagKeys.length));
        }
        for (String ele : tagKeys) {
            this.tagKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the tag keys that you want to remove from the specified resources.
     * </p>
     * 
     * @param tagKeys
     *        A list of the tag keys that you want to remove from the specified resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagResourcesRequest withTagKeys(java.util.Collection<String> tagKeys) {
        setTagKeys(tagKeys);
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
        if (getResourceARNList() != null)
            sb.append("ResourceARNList: ").append(getResourceARNList()).append(",");
        if (getTagKeys() != null)
            sb.append("TagKeys: ").append(getTagKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UntagResourcesRequest == false)
            return false;
        UntagResourcesRequest other = (UntagResourcesRequest) obj;
        if (other.getResourceARNList() == null ^ this.getResourceARNList() == null)
            return false;
        if (other.getResourceARNList() != null && other.getResourceARNList().equals(this.getResourceARNList()) == false)
            return false;
        if (other.getTagKeys() == null ^ this.getTagKeys() == null)
            return false;
        if (other.getTagKeys() != null && other.getTagKeys().equals(this.getTagKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceARNList() == null) ? 0 : getResourceARNList().hashCode());
        hashCode = prime * hashCode + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode());
        return hashCode;
    }

    @Override
    public UntagResourcesRequest clone() {
        return (UntagResourcesRequest) super.clone();
    }

}
