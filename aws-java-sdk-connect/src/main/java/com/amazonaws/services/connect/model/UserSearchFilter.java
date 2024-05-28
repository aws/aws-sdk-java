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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Filters to be applied to search results.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UserSearchFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserSearchFilter implements Serializable, Cloneable, StructuredPojo {

    private ControlPlaneTagFilter tagFilter;
    /**
     * <p>
     * An object that can be used to specify Tag conditions or Hierarchy Group conditions inside the SearchFilter.
     * </p>
     * <p>
     * This accepts an <code>OR</code> of <code>AND</code> (List of List) input where:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The top level list specifies conditions that need to be applied with <code>OR</code> operator.
     * </p>
     * </li>
     * <li>
     * <p>
     * The inner list specifies conditions that need to be applied with <code>AND</code> operator.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Only one field can be populated. This object can’t be used along with TagFilter. Request can either contain
     * TagFilter or UserAttributeFilter if SearchFilter is specified, combination of both is not supported and such
     * request will throw AccessDeniedException.
     * </p>
     * </note>
     */
    private ControlPlaneUserAttributeFilter userAttributeFilter;

    /**
     * @param tagFilter
     */

    public void setTagFilter(ControlPlaneTagFilter tagFilter) {
        this.tagFilter = tagFilter;
    }

    /**
     * @return
     */

    public ControlPlaneTagFilter getTagFilter() {
        return this.tagFilter;
    }

    /**
     * @param tagFilter
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserSearchFilter withTagFilter(ControlPlaneTagFilter tagFilter) {
        setTagFilter(tagFilter);
        return this;
    }

    /**
     * <p>
     * An object that can be used to specify Tag conditions or Hierarchy Group conditions inside the SearchFilter.
     * </p>
     * <p>
     * This accepts an <code>OR</code> of <code>AND</code> (List of List) input where:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The top level list specifies conditions that need to be applied with <code>OR</code> operator.
     * </p>
     * </li>
     * <li>
     * <p>
     * The inner list specifies conditions that need to be applied with <code>AND</code> operator.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Only one field can be populated. This object can’t be used along with TagFilter. Request can either contain
     * TagFilter or UserAttributeFilter if SearchFilter is specified, combination of both is not supported and such
     * request will throw AccessDeniedException.
     * </p>
     * </note>
     * 
     * @param userAttributeFilter
     *        An object that can be used to specify Tag conditions or Hierarchy Group conditions inside the
     *        SearchFilter.</p>
     *        <p>
     *        This accepts an <code>OR</code> of <code>AND</code> (List of List) input where:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The top level list specifies conditions that need to be applied with <code>OR</code> operator.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The inner list specifies conditions that need to be applied with <code>AND</code> operator.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Only one field can be populated. This object can’t be used along with TagFilter. Request can either
     *        contain TagFilter or UserAttributeFilter if SearchFilter is specified, combination of both is not
     *        supported and such request will throw AccessDeniedException.
     *        </p>
     */

    public void setUserAttributeFilter(ControlPlaneUserAttributeFilter userAttributeFilter) {
        this.userAttributeFilter = userAttributeFilter;
    }

    /**
     * <p>
     * An object that can be used to specify Tag conditions or Hierarchy Group conditions inside the SearchFilter.
     * </p>
     * <p>
     * This accepts an <code>OR</code> of <code>AND</code> (List of List) input where:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The top level list specifies conditions that need to be applied with <code>OR</code> operator.
     * </p>
     * </li>
     * <li>
     * <p>
     * The inner list specifies conditions that need to be applied with <code>AND</code> operator.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Only one field can be populated. This object can’t be used along with TagFilter. Request can either contain
     * TagFilter or UserAttributeFilter if SearchFilter is specified, combination of both is not supported and such
     * request will throw AccessDeniedException.
     * </p>
     * </note>
     * 
     * @return An object that can be used to specify Tag conditions or Hierarchy Group conditions inside the
     *         SearchFilter.</p>
     *         <p>
     *         This accepts an <code>OR</code> of <code>AND</code> (List of List) input where:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The top level list specifies conditions that need to be applied with <code>OR</code> operator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The inner list specifies conditions that need to be applied with <code>AND</code> operator.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         Only one field can be populated. This object can’t be used along with TagFilter. Request can either
     *         contain TagFilter or UserAttributeFilter if SearchFilter is specified, combination of both is not
     *         supported and such request will throw AccessDeniedException.
     *         </p>
     */

    public ControlPlaneUserAttributeFilter getUserAttributeFilter() {
        return this.userAttributeFilter;
    }

    /**
     * <p>
     * An object that can be used to specify Tag conditions or Hierarchy Group conditions inside the SearchFilter.
     * </p>
     * <p>
     * This accepts an <code>OR</code> of <code>AND</code> (List of List) input where:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The top level list specifies conditions that need to be applied with <code>OR</code> operator.
     * </p>
     * </li>
     * <li>
     * <p>
     * The inner list specifies conditions that need to be applied with <code>AND</code> operator.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Only one field can be populated. This object can’t be used along with TagFilter. Request can either contain
     * TagFilter or UserAttributeFilter if SearchFilter is specified, combination of both is not supported and such
     * request will throw AccessDeniedException.
     * </p>
     * </note>
     * 
     * @param userAttributeFilter
     *        An object that can be used to specify Tag conditions or Hierarchy Group conditions inside the
     *        SearchFilter.</p>
     *        <p>
     *        This accepts an <code>OR</code> of <code>AND</code> (List of List) input where:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The top level list specifies conditions that need to be applied with <code>OR</code> operator.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The inner list specifies conditions that need to be applied with <code>AND</code> operator.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Only one field can be populated. This object can’t be used along with TagFilter. Request can either
     *        contain TagFilter or UserAttributeFilter if SearchFilter is specified, combination of both is not
     *        supported and such request will throw AccessDeniedException.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserSearchFilter withUserAttributeFilter(ControlPlaneUserAttributeFilter userAttributeFilter) {
        setUserAttributeFilter(userAttributeFilter);
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
        if (getTagFilter() != null)
            sb.append("TagFilter: ").append(getTagFilter()).append(",");
        if (getUserAttributeFilter() != null)
            sb.append("UserAttributeFilter: ").append(getUserAttributeFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserSearchFilter == false)
            return false;
        UserSearchFilter other = (UserSearchFilter) obj;
        if (other.getTagFilter() == null ^ this.getTagFilter() == null)
            return false;
        if (other.getTagFilter() != null && other.getTagFilter().equals(this.getTagFilter()) == false)
            return false;
        if (other.getUserAttributeFilter() == null ^ this.getUserAttributeFilter() == null)
            return false;
        if (other.getUserAttributeFilter() != null && other.getUserAttributeFilter().equals(this.getUserAttributeFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTagFilter() == null) ? 0 : getTagFilter().hashCode());
        hashCode = prime * hashCode + ((getUserAttributeFilter() == null) ? 0 : getUserAttributeFilter().hashCode());
        return hashCode;
    }

    @Override
    public UserSearchFilter clone() {
        try {
            return (UserSearchFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.UserSearchFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
