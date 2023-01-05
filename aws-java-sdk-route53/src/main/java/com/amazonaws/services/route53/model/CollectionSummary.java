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
 * A complex type that is an entry in an <a
 * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_CidrCollection.html">CidrCollection</a> array.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CollectionSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CollectionSummary implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the collection summary. Can be used to reference the collection in IAM policy or cross-account.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Unique ID for the CIDR collection.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of a CIDR collection.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A sequential counter that Route 53 sets to 1 when you create a CIDR collection and increments by 1 each time you
     * update settings for the CIDR collection.
     * </p>
     */
    private Long version;

    /**
     * <p>
     * The ARN of the collection summary. Can be used to reference the collection in IAM policy or cross-account.
     * </p>
     * 
     * @param arn
     *        The ARN of the collection summary. Can be used to reference the collection in IAM policy or cross-account.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the collection summary. Can be used to reference the collection in IAM policy or cross-account.
     * </p>
     * 
     * @return The ARN of the collection summary. Can be used to reference the collection in IAM policy or
     *         cross-account.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the collection summary. Can be used to reference the collection in IAM policy or cross-account.
     * </p>
     * 
     * @param arn
     *        The ARN of the collection summary. Can be used to reference the collection in IAM policy or cross-account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollectionSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Unique ID for the CIDR collection.
     * </p>
     * 
     * @param id
     *        Unique ID for the CIDR collection.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * Unique ID for the CIDR collection.
     * </p>
     * 
     * @return Unique ID for the CIDR collection.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * Unique ID for the CIDR collection.
     * </p>
     * 
     * @param id
     *        Unique ID for the CIDR collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollectionSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of a CIDR collection.
     * </p>
     * 
     * @param name
     *        The name of a CIDR collection.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a CIDR collection.
     * </p>
     * 
     * @return The name of a CIDR collection.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of a CIDR collection.
     * </p>
     * 
     * @param name
     *        The name of a CIDR collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollectionSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A sequential counter that Route 53 sets to 1 when you create a CIDR collection and increments by 1 each time you
     * update settings for the CIDR collection.
     * </p>
     * 
     * @param version
     *        A sequential counter that Route 53 sets to 1 when you create a CIDR collection and increments by 1 each
     *        time you update settings for the CIDR collection.
     */

    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * <p>
     * A sequential counter that Route 53 sets to 1 when you create a CIDR collection and increments by 1 each time you
     * update settings for the CIDR collection.
     * </p>
     * 
     * @return A sequential counter that Route 53 sets to 1 when you create a CIDR collection and increments by 1 each
     *         time you update settings for the CIDR collection.
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     * <p>
     * A sequential counter that Route 53 sets to 1 when you create a CIDR collection and increments by 1 each time you
     * update settings for the CIDR collection.
     * </p>
     * 
     * @param version
     *        A sequential counter that Route 53 sets to 1 when you create a CIDR collection and increments by 1 each
     *        time you update settings for the CIDR collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollectionSummary withVersion(Long version) {
        setVersion(version);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CollectionSummary == false)
            return false;
        CollectionSummary other = (CollectionSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public CollectionSummary clone() {
        try {
            return (CollectionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
