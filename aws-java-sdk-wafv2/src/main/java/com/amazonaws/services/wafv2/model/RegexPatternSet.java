/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <note>
 * <p>
 * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information, including
 * how to migrate your AWS WAF resources from the prior release, see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
 * </p>
 * </note>
 * <p>
 * Contains one or more regular expressions.
 * </p>
 * <p>
 * AWS WAF assigns an ARN to each <code>RegexPatternSet</code> that you create. To use a set in a rule, you provide the
 * ARN to the <a>Rule</a> statement <a>RegexPatternSetReferenceStatement</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/RegexPatternSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegexPatternSet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A friendly name of the set. You cannot change the name after you create the set.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A unique identifier for the set. This ID is returned in the responses to create and list commands. You provide it
     * to operations like update and delete.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the entity.
     * </p>
     */
    private String aRN;
    /**
     * <p>
     * A friendly description of the set. You cannot change the description of a set after you create it.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The regular expression patterns in the set.
     * </p>
     */
    private java.util.List<Regex> regularExpressionList;

    /**
     * <p>
     * A friendly name of the set. You cannot change the name after you create the set.
     * </p>
     * 
     * @param name
     *        A friendly name of the set. You cannot change the name after you create the set.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name of the set. You cannot change the name after you create the set.
     * </p>
     * 
     * @return A friendly name of the set. You cannot change the name after you create the set.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A friendly name of the set. You cannot change the name after you create the set.
     * </p>
     * 
     * @param name
     *        A friendly name of the set. You cannot change the name after you create the set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegexPatternSet withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the set. This ID is returned in the responses to create and list commands. You provide it
     * to operations like update and delete.
     * </p>
     * 
     * @param id
     *        A unique identifier for the set. This ID is returned in the responses to create and list commands. You
     *        provide it to operations like update and delete.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A unique identifier for the set. This ID is returned in the responses to create and list commands. You provide it
     * to operations like update and delete.
     * </p>
     * 
     * @return A unique identifier for the set. This ID is returned in the responses to create and list commands. You
     *         provide it to operations like update and delete.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A unique identifier for the set. This ID is returned in the responses to create and list commands. You provide it
     * to operations like update and delete.
     * </p>
     * 
     * @param id
     *        A unique identifier for the set. This ID is returned in the responses to create and list commands. You
     *        provide it to operations like update and delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegexPatternSet withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the entity.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the entity.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the entity.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the entity.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the entity.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegexPatternSet withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * <p>
     * A friendly description of the set. You cannot change the description of a set after you create it.
     * </p>
     * 
     * @param description
     *        A friendly description of the set. You cannot change the description of a set after you create it.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A friendly description of the set. You cannot change the description of a set after you create it.
     * </p>
     * 
     * @return A friendly description of the set. You cannot change the description of a set after you create it.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A friendly description of the set. You cannot change the description of a set after you create it.
     * </p>
     * 
     * @param description
     *        A friendly description of the set. You cannot change the description of a set after you create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegexPatternSet withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The regular expression patterns in the set.
     * </p>
     * 
     * @return The regular expression patterns in the set.
     */

    public java.util.List<Regex> getRegularExpressionList() {
        return regularExpressionList;
    }

    /**
     * <p>
     * The regular expression patterns in the set.
     * </p>
     * 
     * @param regularExpressionList
     *        The regular expression patterns in the set.
     */

    public void setRegularExpressionList(java.util.Collection<Regex> regularExpressionList) {
        if (regularExpressionList == null) {
            this.regularExpressionList = null;
            return;
        }

        this.regularExpressionList = new java.util.ArrayList<Regex>(regularExpressionList);
    }

    /**
     * <p>
     * The regular expression patterns in the set.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegularExpressionList(java.util.Collection)} or
     * {@link #withRegularExpressionList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param regularExpressionList
     *        The regular expression patterns in the set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegexPatternSet withRegularExpressionList(Regex... regularExpressionList) {
        if (this.regularExpressionList == null) {
            setRegularExpressionList(new java.util.ArrayList<Regex>(regularExpressionList.length));
        }
        for (Regex ele : regularExpressionList) {
            this.regularExpressionList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The regular expression patterns in the set.
     * </p>
     * 
     * @param regularExpressionList
     *        The regular expression patterns in the set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegexPatternSet withRegularExpressionList(java.util.Collection<Regex> regularExpressionList) {
        setRegularExpressionList(regularExpressionList);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getARN() != null)
            sb.append("ARN: ").append(getARN()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRegularExpressionList() != null)
            sb.append("RegularExpressionList: ").append(getRegularExpressionList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegexPatternSet == false)
            return false;
        RegexPatternSet other = (RegexPatternSet) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRegularExpressionList() == null ^ this.getRegularExpressionList() == null)
            return false;
        if (other.getRegularExpressionList() != null && other.getRegularExpressionList().equals(this.getRegularExpressionList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRegularExpressionList() == null) ? 0 : getRegularExpressionList().hashCode());
        return hashCode;
    }

    @Override
    public RegexPatternSet clone() {
        try {
            return (RegexPatternSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.RegexPatternSetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
