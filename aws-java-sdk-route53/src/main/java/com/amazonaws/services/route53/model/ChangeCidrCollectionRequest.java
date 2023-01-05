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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ChangeCidrCollection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChangeCidrCollectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The UUID of the CIDR collection to update.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A sequential counter that Amazon Route 53 sets to 1 when you create a collection and increments it by 1 each time
     * you update the collection.
     * </p>
     * <p>
     * We recommend that you use <code>ListCidrCollection</code> to get the current value of
     * <code>CollectionVersion</code> for the collection that you want to update, and then include that value with the
     * change request. This prevents Route 53 from overwriting an intervening update:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the value in the request matches the value of <code>CollectionVersion</code> in the collection, Route 53
     * updates the collection.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value of <code>CollectionVersion</code> in the collection is greater than the value in the request, the
     * collection was changed after you got the version number. Route 53 does not update the collection, and it returns
     * a <code>CidrCollectionVersionMismatch</code> error.
     * </p>
     * </li>
     * </ul>
     */
    private Long collectionVersion;
    /**
     * <p>
     * Information about changes to a CIDR collection.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CidrCollectionChange> changes;

    /**
     * <p>
     * The UUID of the CIDR collection to update.
     * </p>
     * 
     * @param id
     *        The UUID of the CIDR collection to update.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The UUID of the CIDR collection to update.
     * </p>
     * 
     * @return The UUID of the CIDR collection to update.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The UUID of the CIDR collection to update.
     * </p>
     * 
     * @param id
     *        The UUID of the CIDR collection to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeCidrCollectionRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A sequential counter that Amazon Route 53 sets to 1 when you create a collection and increments it by 1 each time
     * you update the collection.
     * </p>
     * <p>
     * We recommend that you use <code>ListCidrCollection</code> to get the current value of
     * <code>CollectionVersion</code> for the collection that you want to update, and then include that value with the
     * change request. This prevents Route 53 from overwriting an intervening update:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the value in the request matches the value of <code>CollectionVersion</code> in the collection, Route 53
     * updates the collection.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value of <code>CollectionVersion</code> in the collection is greater than the value in the request, the
     * collection was changed after you got the version number. Route 53 does not update the collection, and it returns
     * a <code>CidrCollectionVersionMismatch</code> error.
     * </p>
     * </li>
     * </ul>
     * 
     * @param collectionVersion
     *        A sequential counter that Amazon Route 53 sets to 1 when you create a collection and increments it by 1
     *        each time you update the collection.</p>
     *        <p>
     *        We recommend that you use <code>ListCidrCollection</code> to get the current value of
     *        <code>CollectionVersion</code> for the collection that you want to update, and then include that value
     *        with the change request. This prevents Route 53 from overwriting an intervening update:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the value in the request matches the value of <code>CollectionVersion</code> in the collection,
     *        Route 53 updates the collection.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the value of <code>CollectionVersion</code> in the collection is greater than the value in the request,
     *        the collection was changed after you got the version number. Route 53 does not update the collection, and
     *        it returns a <code>CidrCollectionVersionMismatch</code> error.
     *        </p>
     *        </li>
     */

    public void setCollectionVersion(Long collectionVersion) {
        this.collectionVersion = collectionVersion;
    }

    /**
     * <p>
     * A sequential counter that Amazon Route 53 sets to 1 when you create a collection and increments it by 1 each time
     * you update the collection.
     * </p>
     * <p>
     * We recommend that you use <code>ListCidrCollection</code> to get the current value of
     * <code>CollectionVersion</code> for the collection that you want to update, and then include that value with the
     * change request. This prevents Route 53 from overwriting an intervening update:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the value in the request matches the value of <code>CollectionVersion</code> in the collection, Route 53
     * updates the collection.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value of <code>CollectionVersion</code> in the collection is greater than the value in the request, the
     * collection was changed after you got the version number. Route 53 does not update the collection, and it returns
     * a <code>CidrCollectionVersionMismatch</code> error.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A sequential counter that Amazon Route 53 sets to 1 when you create a collection and increments it by 1
     *         each time you update the collection.</p>
     *         <p>
     *         We recommend that you use <code>ListCidrCollection</code> to get the current value of
     *         <code>CollectionVersion</code> for the collection that you want to update, and then include that value
     *         with the change request. This prevents Route 53 from overwriting an intervening update:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the value in the request matches the value of <code>CollectionVersion</code> in the collection,
     *         Route 53 updates the collection.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the value of <code>CollectionVersion</code> in the collection is greater than the value in the
     *         request, the collection was changed after you got the version number. Route 53 does not update the
     *         collection, and it returns a <code>CidrCollectionVersionMismatch</code> error.
     *         </p>
     *         </li>
     */

    public Long getCollectionVersion() {
        return this.collectionVersion;
    }

    /**
     * <p>
     * A sequential counter that Amazon Route 53 sets to 1 when you create a collection and increments it by 1 each time
     * you update the collection.
     * </p>
     * <p>
     * We recommend that you use <code>ListCidrCollection</code> to get the current value of
     * <code>CollectionVersion</code> for the collection that you want to update, and then include that value with the
     * change request. This prevents Route 53 from overwriting an intervening update:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the value in the request matches the value of <code>CollectionVersion</code> in the collection, Route 53
     * updates the collection.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value of <code>CollectionVersion</code> in the collection is greater than the value in the request, the
     * collection was changed after you got the version number. Route 53 does not update the collection, and it returns
     * a <code>CidrCollectionVersionMismatch</code> error.
     * </p>
     * </li>
     * </ul>
     * 
     * @param collectionVersion
     *        A sequential counter that Amazon Route 53 sets to 1 when you create a collection and increments it by 1
     *        each time you update the collection.</p>
     *        <p>
     *        We recommend that you use <code>ListCidrCollection</code> to get the current value of
     *        <code>CollectionVersion</code> for the collection that you want to update, and then include that value
     *        with the change request. This prevents Route 53 from overwriting an intervening update:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the value in the request matches the value of <code>CollectionVersion</code> in the collection,
     *        Route 53 updates the collection.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the value of <code>CollectionVersion</code> in the collection is greater than the value in the request,
     *        the collection was changed after you got the version number. Route 53 does not update the collection, and
     *        it returns a <code>CidrCollectionVersionMismatch</code> error.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeCidrCollectionRequest withCollectionVersion(Long collectionVersion) {
        setCollectionVersion(collectionVersion);
        return this;
    }

    /**
     * <p>
     * Information about changes to a CIDR collection.
     * </p>
     * 
     * @return Information about changes to a CIDR collection.
     */

    public java.util.List<CidrCollectionChange> getChanges() {
        if (changes == null) {
            changes = new com.amazonaws.internal.SdkInternalList<CidrCollectionChange>();
        }
        return changes;
    }

    /**
     * <p>
     * Information about changes to a CIDR collection.
     * </p>
     * 
     * @param changes
     *        Information about changes to a CIDR collection.
     */

    public void setChanges(java.util.Collection<CidrCollectionChange> changes) {
        if (changes == null) {
            this.changes = null;
            return;
        }

        this.changes = new com.amazonaws.internal.SdkInternalList<CidrCollectionChange>(changes);
    }

    /**
     * <p>
     * Information about changes to a CIDR collection.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChanges(java.util.Collection)} or {@link #withChanges(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param changes
     *        Information about changes to a CIDR collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeCidrCollectionRequest withChanges(CidrCollectionChange... changes) {
        if (this.changes == null) {
            setChanges(new com.amazonaws.internal.SdkInternalList<CidrCollectionChange>(changes.length));
        }
        for (CidrCollectionChange ele : changes) {
            this.changes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about changes to a CIDR collection.
     * </p>
     * 
     * @param changes
     *        Information about changes to a CIDR collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeCidrCollectionRequest withChanges(java.util.Collection<CidrCollectionChange> changes) {
        setChanges(changes);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getCollectionVersion() != null)
            sb.append("CollectionVersion: ").append(getCollectionVersion()).append(",");
        if (getChanges() != null)
            sb.append("Changes: ").append(getChanges());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChangeCidrCollectionRequest == false)
            return false;
        ChangeCidrCollectionRequest other = (ChangeCidrCollectionRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getCollectionVersion() == null ^ this.getCollectionVersion() == null)
            return false;
        if (other.getCollectionVersion() != null && other.getCollectionVersion().equals(this.getCollectionVersion()) == false)
            return false;
        if (other.getChanges() == null ^ this.getChanges() == null)
            return false;
        if (other.getChanges() != null && other.getChanges().equals(this.getChanges()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getCollectionVersion() == null) ? 0 : getCollectionVersion().hashCode());
        hashCode = prime * hashCode + ((getChanges() == null) ? 0 : getChanges().hashCode());
        return hashCode;
    }

    @Override
    public ChangeCidrCollectionRequest clone() {
        return (ChangeCidrCollectionRequest) super.clone();
    }

}
