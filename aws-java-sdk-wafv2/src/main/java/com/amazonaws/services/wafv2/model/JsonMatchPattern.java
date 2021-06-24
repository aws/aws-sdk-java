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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The patterns to look for in the JSON body. WAF inspects the results of these pattern matches against the rule
 * inspection criteria. This is used with the <a>FieldToMatch</a> option <code>JsonBody</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/JsonMatchPattern" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JsonMatchPattern implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Match all of the elements. See also <code>MatchScope</code> in <a>JsonBody</a>.
     * </p>
     * <p>
     * You must specify either this setting or the <code>IncludedPaths</code> setting, but not both.
     * </p>
     */
    private All all;
    /**
     * <p>
     * Match only the specified include paths. See also <code>MatchScope</code> in <a>JsonBody</a>.
     * </p>
     * <p>
     * Provide the include paths using JSON Pointer syntax. For example,
     * <code>"IncludedPaths": ["/dogs/0/name", "/dogs/1/name"]</code>. For information about this syntax, see the
     * Internet Engineering Task Force (IETF) documentation <a href="https://tools.ietf.org/html/rfc6901">JavaScript
     * Object Notation (JSON) Pointer</a>.
     * </p>
     * <p>
     * You must specify either this setting or the <code>All</code> setting, but not both.
     * </p>
     * <note>
     * <p>
     * Don't use this option to include all paths. Instead, use the <code>All</code> setting.
     * </p>
     * </note>
     */
    private java.util.List<String> includedPaths;

    /**
     * <p>
     * Match all of the elements. See also <code>MatchScope</code> in <a>JsonBody</a>.
     * </p>
     * <p>
     * You must specify either this setting or the <code>IncludedPaths</code> setting, but not both.
     * </p>
     * 
     * @param all
     *        Match all of the elements. See also <code>MatchScope</code> in <a>JsonBody</a>. </p>
     *        <p>
     *        You must specify either this setting or the <code>IncludedPaths</code> setting, but not both.
     */

    public void setAll(All all) {
        this.all = all;
    }

    /**
     * <p>
     * Match all of the elements. See also <code>MatchScope</code> in <a>JsonBody</a>.
     * </p>
     * <p>
     * You must specify either this setting or the <code>IncludedPaths</code> setting, but not both.
     * </p>
     * 
     * @return Match all of the elements. See also <code>MatchScope</code> in <a>JsonBody</a>. </p>
     *         <p>
     *         You must specify either this setting or the <code>IncludedPaths</code> setting, but not both.
     */

    public All getAll() {
        return this.all;
    }

    /**
     * <p>
     * Match all of the elements. See also <code>MatchScope</code> in <a>JsonBody</a>.
     * </p>
     * <p>
     * You must specify either this setting or the <code>IncludedPaths</code> setting, but not both.
     * </p>
     * 
     * @param all
     *        Match all of the elements. See also <code>MatchScope</code> in <a>JsonBody</a>. </p>
     *        <p>
     *        You must specify either this setting or the <code>IncludedPaths</code> setting, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JsonMatchPattern withAll(All all) {
        setAll(all);
        return this;
    }

    /**
     * <p>
     * Match only the specified include paths. See also <code>MatchScope</code> in <a>JsonBody</a>.
     * </p>
     * <p>
     * Provide the include paths using JSON Pointer syntax. For example,
     * <code>"IncludedPaths": ["/dogs/0/name", "/dogs/1/name"]</code>. For information about this syntax, see the
     * Internet Engineering Task Force (IETF) documentation <a href="https://tools.ietf.org/html/rfc6901">JavaScript
     * Object Notation (JSON) Pointer</a>.
     * </p>
     * <p>
     * You must specify either this setting or the <code>All</code> setting, but not both.
     * </p>
     * <note>
     * <p>
     * Don't use this option to include all paths. Instead, use the <code>All</code> setting.
     * </p>
     * </note>
     * 
     * @return Match only the specified include paths. See also <code>MatchScope</code> in <a>JsonBody</a>. </p>
     *         <p>
     *         Provide the include paths using JSON Pointer syntax. For example,
     *         <code>"IncludedPaths": ["/dogs/0/name", "/dogs/1/name"]</code>. For information about this syntax, see
     *         the Internet Engineering Task Force (IETF) documentation <a
     *         href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     *         </p>
     *         <p>
     *         You must specify either this setting or the <code>All</code> setting, but not both.
     *         </p>
     *         <note>
     *         <p>
     *         Don't use this option to include all paths. Instead, use the <code>All</code> setting.
     *         </p>
     */

    public java.util.List<String> getIncludedPaths() {
        return includedPaths;
    }

    /**
     * <p>
     * Match only the specified include paths. See also <code>MatchScope</code> in <a>JsonBody</a>.
     * </p>
     * <p>
     * Provide the include paths using JSON Pointer syntax. For example,
     * <code>"IncludedPaths": ["/dogs/0/name", "/dogs/1/name"]</code>. For information about this syntax, see the
     * Internet Engineering Task Force (IETF) documentation <a href="https://tools.ietf.org/html/rfc6901">JavaScript
     * Object Notation (JSON) Pointer</a>.
     * </p>
     * <p>
     * You must specify either this setting or the <code>All</code> setting, but not both.
     * </p>
     * <note>
     * <p>
     * Don't use this option to include all paths. Instead, use the <code>All</code> setting.
     * </p>
     * </note>
     * 
     * @param includedPaths
     *        Match only the specified include paths. See also <code>MatchScope</code> in <a>JsonBody</a>. </p>
     *        <p>
     *        Provide the include paths using JSON Pointer syntax. For example,
     *        <code>"IncludedPaths": ["/dogs/0/name", "/dogs/1/name"]</code>. For information about this syntax, see the
     *        Internet Engineering Task Force (IETF) documentation <a
     *        href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     *        </p>
     *        <p>
     *        You must specify either this setting or the <code>All</code> setting, but not both.
     *        </p>
     *        <note>
     *        <p>
     *        Don't use this option to include all paths. Instead, use the <code>All</code> setting.
     *        </p>
     */

    public void setIncludedPaths(java.util.Collection<String> includedPaths) {
        if (includedPaths == null) {
            this.includedPaths = null;
            return;
        }

        this.includedPaths = new java.util.ArrayList<String>(includedPaths);
    }

    /**
     * <p>
     * Match only the specified include paths. See also <code>MatchScope</code> in <a>JsonBody</a>.
     * </p>
     * <p>
     * Provide the include paths using JSON Pointer syntax. For example,
     * <code>"IncludedPaths": ["/dogs/0/name", "/dogs/1/name"]</code>. For information about this syntax, see the
     * Internet Engineering Task Force (IETF) documentation <a href="https://tools.ietf.org/html/rfc6901">JavaScript
     * Object Notation (JSON) Pointer</a>.
     * </p>
     * <p>
     * You must specify either this setting or the <code>All</code> setting, but not both.
     * </p>
     * <note>
     * <p>
     * Don't use this option to include all paths. Instead, use the <code>All</code> setting.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIncludedPaths(java.util.Collection)} or {@link #withIncludedPaths(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param includedPaths
     *        Match only the specified include paths. See also <code>MatchScope</code> in <a>JsonBody</a>. </p>
     *        <p>
     *        Provide the include paths using JSON Pointer syntax. For example,
     *        <code>"IncludedPaths": ["/dogs/0/name", "/dogs/1/name"]</code>. For information about this syntax, see the
     *        Internet Engineering Task Force (IETF) documentation <a
     *        href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     *        </p>
     *        <p>
     *        You must specify either this setting or the <code>All</code> setting, but not both.
     *        </p>
     *        <note>
     *        <p>
     *        Don't use this option to include all paths. Instead, use the <code>All</code> setting.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JsonMatchPattern withIncludedPaths(String... includedPaths) {
        if (this.includedPaths == null) {
            setIncludedPaths(new java.util.ArrayList<String>(includedPaths.length));
        }
        for (String ele : includedPaths) {
            this.includedPaths.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Match only the specified include paths. See also <code>MatchScope</code> in <a>JsonBody</a>.
     * </p>
     * <p>
     * Provide the include paths using JSON Pointer syntax. For example,
     * <code>"IncludedPaths": ["/dogs/0/name", "/dogs/1/name"]</code>. For information about this syntax, see the
     * Internet Engineering Task Force (IETF) documentation <a href="https://tools.ietf.org/html/rfc6901">JavaScript
     * Object Notation (JSON) Pointer</a>.
     * </p>
     * <p>
     * You must specify either this setting or the <code>All</code> setting, but not both.
     * </p>
     * <note>
     * <p>
     * Don't use this option to include all paths. Instead, use the <code>All</code> setting.
     * </p>
     * </note>
     * 
     * @param includedPaths
     *        Match only the specified include paths. See also <code>MatchScope</code> in <a>JsonBody</a>. </p>
     *        <p>
     *        Provide the include paths using JSON Pointer syntax. For example,
     *        <code>"IncludedPaths": ["/dogs/0/name", "/dogs/1/name"]</code>. For information about this syntax, see the
     *        Internet Engineering Task Force (IETF) documentation <a
     *        href="https://tools.ietf.org/html/rfc6901">JavaScript Object Notation (JSON) Pointer</a>.
     *        </p>
     *        <p>
     *        You must specify either this setting or the <code>All</code> setting, but not both.
     *        </p>
     *        <note>
     *        <p>
     *        Don't use this option to include all paths. Instead, use the <code>All</code> setting.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JsonMatchPattern withIncludedPaths(java.util.Collection<String> includedPaths) {
        setIncludedPaths(includedPaths);
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
        if (getAll() != null)
            sb.append("All: ").append(getAll()).append(",");
        if (getIncludedPaths() != null)
            sb.append("IncludedPaths: ").append(getIncludedPaths());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JsonMatchPattern == false)
            return false;
        JsonMatchPattern other = (JsonMatchPattern) obj;
        if (other.getAll() == null ^ this.getAll() == null)
            return false;
        if (other.getAll() != null && other.getAll().equals(this.getAll()) == false)
            return false;
        if (other.getIncludedPaths() == null ^ this.getIncludedPaths() == null)
            return false;
        if (other.getIncludedPaths() != null && other.getIncludedPaths().equals(this.getIncludedPaths()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAll() == null) ? 0 : getAll().hashCode());
        hashCode = prime * hashCode + ((getIncludedPaths() == null) ? 0 : getIncludedPaths().hashCode());
        return hashCode;
    }

    @Override
    public JsonMatchPattern clone() {
        try {
            return (JsonMatchPattern) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.JsonMatchPatternMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
