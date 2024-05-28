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
package com.amazonaws.services.textract.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An adapter selected for use when analyzing documents. Contains an adapter ID and a version number. Contains
 * information on pages selected for analysis when analyzing documents asychronously.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/Adapter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Adapter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the adapter resource.
     * </p>
     */
    private String adapterId;
    /**
     * <p>
     * Pages is a parameter that the user inputs to specify which pages to apply an adapter to. The following is a list
     * of rules for using this parameter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If a page is not specified, it is set to <code>["1"]</code> by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * The following characters are allowed in the parameter's string: <code>0 1 2 3 4 5 6 7 8 9 - *</code>. No
     * whitespace is allowed.
     * </p>
     * </li>
     * <li>
     * <p>
     * When using * to indicate all pages, it must be the only element in the list.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can use page intervals, such as <code>["1-3", "1-1", "4-*"]</code>. Where <code>*</code> indicates last page
     * of document.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified pages must be greater than 0 and less than or equal to the number of pages in the document.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> pages;
    /**
     * <p>
     * A string that identifies the version of the adapter.
     * </p>
     */
    private String version;

    /**
     * <p>
     * A unique identifier for the adapter resource.
     * </p>
     * 
     * @param adapterId
     *        A unique identifier for the adapter resource.
     */

    public void setAdapterId(String adapterId) {
        this.adapterId = adapterId;
    }

    /**
     * <p>
     * A unique identifier for the adapter resource.
     * </p>
     * 
     * @return A unique identifier for the adapter resource.
     */

    public String getAdapterId() {
        return this.adapterId;
    }

    /**
     * <p>
     * A unique identifier for the adapter resource.
     * </p>
     * 
     * @param adapterId
     *        A unique identifier for the adapter resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Adapter withAdapterId(String adapterId) {
        setAdapterId(adapterId);
        return this;
    }

    /**
     * <p>
     * Pages is a parameter that the user inputs to specify which pages to apply an adapter to. The following is a list
     * of rules for using this parameter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If a page is not specified, it is set to <code>["1"]</code> by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * The following characters are allowed in the parameter's string: <code>0 1 2 3 4 5 6 7 8 9 - *</code>. No
     * whitespace is allowed.
     * </p>
     * </li>
     * <li>
     * <p>
     * When using * to indicate all pages, it must be the only element in the list.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can use page intervals, such as <code>["1-3", "1-1", "4-*"]</code>. Where <code>*</code> indicates last page
     * of document.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified pages must be greater than 0 and less than or equal to the number of pages in the document.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Pages is a parameter that the user inputs to specify which pages to apply an adapter to. The following is
     *         a list of rules for using this parameter.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If a page is not specified, it is set to <code>["1"]</code> by default.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The following characters are allowed in the parameter's string: <code>0 1 2 3 4 5 6 7 8 9 - *</code>. No
     *         whitespace is allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         When using * to indicate all pages, it must be the only element in the list.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can use page intervals, such as <code>["1-3", "1-1", "4-*"]</code>. Where <code>*</code> indicates
     *         last page of document.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specified pages must be greater than 0 and less than or equal to the number of pages in the document.
     *         </p>
     *         </li>
     */

    public java.util.List<String> getPages() {
        return pages;
    }

    /**
     * <p>
     * Pages is a parameter that the user inputs to specify which pages to apply an adapter to. The following is a list
     * of rules for using this parameter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If a page is not specified, it is set to <code>["1"]</code> by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * The following characters are allowed in the parameter's string: <code>0 1 2 3 4 5 6 7 8 9 - *</code>. No
     * whitespace is allowed.
     * </p>
     * </li>
     * <li>
     * <p>
     * When using * to indicate all pages, it must be the only element in the list.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can use page intervals, such as <code>["1-3", "1-1", "4-*"]</code>. Where <code>*</code> indicates last page
     * of document.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified pages must be greater than 0 and less than or equal to the number of pages in the document.
     * </p>
     * </li>
     * </ul>
     * 
     * @param pages
     *        Pages is a parameter that the user inputs to specify which pages to apply an adapter to. The following is
     *        a list of rules for using this parameter.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If a page is not specified, it is set to <code>["1"]</code> by default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The following characters are allowed in the parameter's string: <code>0 1 2 3 4 5 6 7 8 9 - *</code>. No
     *        whitespace is allowed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When using * to indicate all pages, it must be the only element in the list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can use page intervals, such as <code>["1-3", "1-1", "4-*"]</code>. Where <code>*</code> indicates
     *        last page of document.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specified pages must be greater than 0 and less than or equal to the number of pages in the document.
     *        </p>
     *        </li>
     */

    public void setPages(java.util.Collection<String> pages) {
        if (pages == null) {
            this.pages = null;
            return;
        }

        this.pages = new java.util.ArrayList<String>(pages);
    }

    /**
     * <p>
     * Pages is a parameter that the user inputs to specify which pages to apply an adapter to. The following is a list
     * of rules for using this parameter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If a page is not specified, it is set to <code>["1"]</code> by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * The following characters are allowed in the parameter's string: <code>0 1 2 3 4 5 6 7 8 9 - *</code>. No
     * whitespace is allowed.
     * </p>
     * </li>
     * <li>
     * <p>
     * When using * to indicate all pages, it must be the only element in the list.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can use page intervals, such as <code>["1-3", "1-1", "4-*"]</code>. Where <code>*</code> indicates last page
     * of document.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified pages must be greater than 0 and less than or equal to the number of pages in the document.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPages(java.util.Collection)} or {@link #withPages(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param pages
     *        Pages is a parameter that the user inputs to specify which pages to apply an adapter to. The following is
     *        a list of rules for using this parameter.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If a page is not specified, it is set to <code>["1"]</code> by default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The following characters are allowed in the parameter's string: <code>0 1 2 3 4 5 6 7 8 9 - *</code>. No
     *        whitespace is allowed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When using * to indicate all pages, it must be the only element in the list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can use page intervals, such as <code>["1-3", "1-1", "4-*"]</code>. Where <code>*</code> indicates
     *        last page of document.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specified pages must be greater than 0 and less than or equal to the number of pages in the document.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Adapter withPages(String... pages) {
        if (this.pages == null) {
            setPages(new java.util.ArrayList<String>(pages.length));
        }
        for (String ele : pages) {
            this.pages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Pages is a parameter that the user inputs to specify which pages to apply an adapter to. The following is a list
     * of rules for using this parameter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If a page is not specified, it is set to <code>["1"]</code> by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * The following characters are allowed in the parameter's string: <code>0 1 2 3 4 5 6 7 8 9 - *</code>. No
     * whitespace is allowed.
     * </p>
     * </li>
     * <li>
     * <p>
     * When using * to indicate all pages, it must be the only element in the list.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can use page intervals, such as <code>["1-3", "1-1", "4-*"]</code>. Where <code>*</code> indicates last page
     * of document.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified pages must be greater than 0 and less than or equal to the number of pages in the document.
     * </p>
     * </li>
     * </ul>
     * 
     * @param pages
     *        Pages is a parameter that the user inputs to specify which pages to apply an adapter to. The following is
     *        a list of rules for using this parameter.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If a page is not specified, it is set to <code>["1"]</code> by default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The following characters are allowed in the parameter's string: <code>0 1 2 3 4 5 6 7 8 9 - *</code>. No
     *        whitespace is allowed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When using * to indicate all pages, it must be the only element in the list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can use page intervals, such as <code>["1-3", "1-1", "4-*"]</code>. Where <code>*</code> indicates
     *        last page of document.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specified pages must be greater than 0 and less than or equal to the number of pages in the document.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Adapter withPages(java.util.Collection<String> pages) {
        setPages(pages);
        return this;
    }

    /**
     * <p>
     * A string that identifies the version of the adapter.
     * </p>
     * 
     * @param version
     *        A string that identifies the version of the adapter.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * A string that identifies the version of the adapter.
     * </p>
     * 
     * @return A string that identifies the version of the adapter.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * A string that identifies the version of the adapter.
     * </p>
     * 
     * @param version
     *        A string that identifies the version of the adapter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Adapter withVersion(String version) {
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
        if (getAdapterId() != null)
            sb.append("AdapterId: ").append(getAdapterId()).append(",");
        if (getPages() != null)
            sb.append("Pages: ").append(getPages()).append(",");
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

        if (obj instanceof Adapter == false)
            return false;
        Adapter other = (Adapter) obj;
        if (other.getAdapterId() == null ^ this.getAdapterId() == null)
            return false;
        if (other.getAdapterId() != null && other.getAdapterId().equals(this.getAdapterId()) == false)
            return false;
        if (other.getPages() == null ^ this.getPages() == null)
            return false;
        if (other.getPages() != null && other.getPages().equals(this.getPages()) == false)
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

        hashCode = prime * hashCode + ((getAdapterId() == null) ? 0 : getAdapterId().hashCode());
        hashCode = prime * hashCode + ((getPages() == null) ? 0 : getPages().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public Adapter clone() {
        try {
            return (Adapter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.textract.model.transform.AdapterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
