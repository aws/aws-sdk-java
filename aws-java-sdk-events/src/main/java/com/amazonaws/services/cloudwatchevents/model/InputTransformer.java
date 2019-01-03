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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the parameters needed for you to provide custom input to a target based on one or more pieces of data
 * extracted from the event.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/InputTransformer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputTransformer implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Map of JSON paths to be extracted from the event. You can then insert these in the template in
     * <code>InputTemplate</code> to produce the output you want to be sent to the target.
     * </p>
     * <p>
     * <code>InputPathsMap</code> is an array key-value pairs, where each value is a valid JSON path. You can have as
     * many as 10 key-value pairs. You must use JSON dot notation, not bracket notation.
     * </p>
     * <p>
     * The keys cannot start with "AWS."
     * </p>
     */
    private java.util.Map<String, String> inputPathsMap;
    /**
     * <p>
     * Input template where you specify placeholders that will be filled with the values of the keys from
     * <code>InputPathsMap</code> to customize the data sent to the target. Enclose each <code>InputPathsMaps</code>
     * value in brackets: &lt;<i>value</i>&gt; The InputTemplate must be valid JSON.
     * </p>
     * <p>
     * If <code>InputTemplate</code> is a JSON object (surrounded by curly braces), the following restrictions apply:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The placeholder cannot be used as an object key.
     * </p>
     * </li>
     * <li>
     * <p>
     * Object values cannot include quote marks.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following example shows the syntax for using <code>InputPathsMap</code> and <code>InputTemplate</code>.
     * </p>
     * <p>
     * <code> "InputTransformer":</code>
     * </p>
     * <p>
     * <code>{</code>
     * </p>
     * <p>
     * <code>"InputPathsMap": {"instance": "$.detail.instance","status": "$.detail.status"},</code>
     * </p>
     * <p>
     * <code>"InputTemplate": "&lt;instance&gt; is in state &lt;status&gt;"</code>
     * </p>
     * <p>
     * <code>}</code>
     * </p>
     * <p>
     * To have the <code>InputTemplate</code> include quote marks within a JSON string, escape each quote marks with a
     * slash, as in the following example:
     * </p>
     * <p>
     * <code> "InputTransformer":</code>
     * </p>
     * <p>
     * <code>{</code>
     * </p>
     * <p>
     * <code>"InputPathsMap": {"instance": "$.detail.instance","status": "$.detail.status"},</code>
     * </p>
     * <p>
     * <code>"InputTemplate": "&lt;instance&gt; is in state \"&lt;status&gt;\""</code>
     * </p>
     * <p>
     * <code>}</code>
     * </p>
     */
    private String inputTemplate;

    /**
     * <p>
     * Map of JSON paths to be extracted from the event. You can then insert these in the template in
     * <code>InputTemplate</code> to produce the output you want to be sent to the target.
     * </p>
     * <p>
     * <code>InputPathsMap</code> is an array key-value pairs, where each value is a valid JSON path. You can have as
     * many as 10 key-value pairs. You must use JSON dot notation, not bracket notation.
     * </p>
     * <p>
     * The keys cannot start with "AWS."
     * </p>
     * 
     * @return Map of JSON paths to be extracted from the event. You can then insert these in the template in
     *         <code>InputTemplate</code> to produce the output you want to be sent to the target.</p>
     *         <p>
     *         <code>InputPathsMap</code> is an array key-value pairs, where each value is a valid JSON path. You can
     *         have as many as 10 key-value pairs. You must use JSON dot notation, not bracket notation.
     *         </p>
     *         <p>
     *         The keys cannot start with "AWS."
     */

    public java.util.Map<String, String> getInputPathsMap() {
        return inputPathsMap;
    }

    /**
     * <p>
     * Map of JSON paths to be extracted from the event. You can then insert these in the template in
     * <code>InputTemplate</code> to produce the output you want to be sent to the target.
     * </p>
     * <p>
     * <code>InputPathsMap</code> is an array key-value pairs, where each value is a valid JSON path. You can have as
     * many as 10 key-value pairs. You must use JSON dot notation, not bracket notation.
     * </p>
     * <p>
     * The keys cannot start with "AWS."
     * </p>
     * 
     * @param inputPathsMap
     *        Map of JSON paths to be extracted from the event. You can then insert these in the template in
     *        <code>InputTemplate</code> to produce the output you want to be sent to the target.</p>
     *        <p>
     *        <code>InputPathsMap</code> is an array key-value pairs, where each value is a valid JSON path. You can
     *        have as many as 10 key-value pairs. You must use JSON dot notation, not bracket notation.
     *        </p>
     *        <p>
     *        The keys cannot start with "AWS."
     */

    public void setInputPathsMap(java.util.Map<String, String> inputPathsMap) {
        this.inputPathsMap = inputPathsMap;
    }

    /**
     * <p>
     * Map of JSON paths to be extracted from the event. You can then insert these in the template in
     * <code>InputTemplate</code> to produce the output you want to be sent to the target.
     * </p>
     * <p>
     * <code>InputPathsMap</code> is an array key-value pairs, where each value is a valid JSON path. You can have as
     * many as 10 key-value pairs. You must use JSON dot notation, not bracket notation.
     * </p>
     * <p>
     * The keys cannot start with "AWS."
     * </p>
     * 
     * @param inputPathsMap
     *        Map of JSON paths to be extracted from the event. You can then insert these in the template in
     *        <code>InputTemplate</code> to produce the output you want to be sent to the target.</p>
     *        <p>
     *        <code>InputPathsMap</code> is an array key-value pairs, where each value is a valid JSON path. You can
     *        have as many as 10 key-value pairs. You must use JSON dot notation, not bracket notation.
     *        </p>
     *        <p>
     *        The keys cannot start with "AWS."
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputTransformer withInputPathsMap(java.util.Map<String, String> inputPathsMap) {
        setInputPathsMap(inputPathsMap);
        return this;
    }

    public InputTransformer addInputPathsMapEntry(String key, String value) {
        if (null == this.inputPathsMap) {
            this.inputPathsMap = new java.util.HashMap<String, String>();
        }
        if (this.inputPathsMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.inputPathsMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into InputPathsMap.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputTransformer clearInputPathsMapEntries() {
        this.inputPathsMap = null;
        return this;
    }

    /**
     * <p>
     * Input template where you specify placeholders that will be filled with the values of the keys from
     * <code>InputPathsMap</code> to customize the data sent to the target. Enclose each <code>InputPathsMaps</code>
     * value in brackets: &lt;<i>value</i>&gt; The InputTemplate must be valid JSON.
     * </p>
     * <p>
     * If <code>InputTemplate</code> is a JSON object (surrounded by curly braces), the following restrictions apply:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The placeholder cannot be used as an object key.
     * </p>
     * </li>
     * <li>
     * <p>
     * Object values cannot include quote marks.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following example shows the syntax for using <code>InputPathsMap</code> and <code>InputTemplate</code>.
     * </p>
     * <p>
     * <code> "InputTransformer":</code>
     * </p>
     * <p>
     * <code>{</code>
     * </p>
     * <p>
     * <code>"InputPathsMap": {"instance": "$.detail.instance","status": "$.detail.status"},</code>
     * </p>
     * <p>
     * <code>"InputTemplate": "&lt;instance&gt; is in state &lt;status&gt;"</code>
     * </p>
     * <p>
     * <code>}</code>
     * </p>
     * <p>
     * To have the <code>InputTemplate</code> include quote marks within a JSON string, escape each quote marks with a
     * slash, as in the following example:
     * </p>
     * <p>
     * <code> "InputTransformer":</code>
     * </p>
     * <p>
     * <code>{</code>
     * </p>
     * <p>
     * <code>"InputPathsMap": {"instance": "$.detail.instance","status": "$.detail.status"},</code>
     * </p>
     * <p>
     * <code>"InputTemplate": "&lt;instance&gt; is in state \"&lt;status&gt;\""</code>
     * </p>
     * <p>
     * <code>}</code>
     * </p>
     * 
     * @param inputTemplate
     *        Input template where you specify placeholders that will be filled with the values of the keys from
     *        <code>InputPathsMap</code> to customize the data sent to the target. Enclose each
     *        <code>InputPathsMaps</code> value in brackets: &lt;<i>value</i>&gt; The InputTemplate must be valid
     *        JSON.</p>
     *        <p>
     *        If <code>InputTemplate</code> is a JSON object (surrounded by curly braces), the following restrictions
     *        apply:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The placeholder cannot be used as an object key.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Object values cannot include quote marks.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following example shows the syntax for using <code>InputPathsMap</code> and <code>InputTemplate</code>
     *        .
     *        </p>
     *        <p>
     *        <code> "InputTransformer":</code>
     *        </p>
     *        <p>
     *        <code>{</code>
     *        </p>
     *        <p>
     *        <code>"InputPathsMap": {"instance": "$.detail.instance","status": "$.detail.status"},</code>
     *        </p>
     *        <p>
     *        <code>"InputTemplate": "&lt;instance&gt; is in state &lt;status&gt;"</code>
     *        </p>
     *        <p>
     *        <code>}</code>
     *        </p>
     *        <p>
     *        To have the <code>InputTemplate</code> include quote marks within a JSON string, escape each quote marks
     *        with a slash, as in the following example:
     *        </p>
     *        <p>
     *        <code> "InputTransformer":</code>
     *        </p>
     *        <p>
     *        <code>{</code>
     *        </p>
     *        <p>
     *        <code>"InputPathsMap": {"instance": "$.detail.instance","status": "$.detail.status"},</code>
     *        </p>
     *        <p>
     *        <code>"InputTemplate": "&lt;instance&gt; is in state \"&lt;status&gt;\""</code>
     *        </p>
     *        <p>
     *        <code>}</code>
     */

    public void setInputTemplate(String inputTemplate) {
        this.inputTemplate = inputTemplate;
    }

    /**
     * <p>
     * Input template where you specify placeholders that will be filled with the values of the keys from
     * <code>InputPathsMap</code> to customize the data sent to the target. Enclose each <code>InputPathsMaps</code>
     * value in brackets: &lt;<i>value</i>&gt; The InputTemplate must be valid JSON.
     * </p>
     * <p>
     * If <code>InputTemplate</code> is a JSON object (surrounded by curly braces), the following restrictions apply:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The placeholder cannot be used as an object key.
     * </p>
     * </li>
     * <li>
     * <p>
     * Object values cannot include quote marks.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following example shows the syntax for using <code>InputPathsMap</code> and <code>InputTemplate</code>.
     * </p>
     * <p>
     * <code> "InputTransformer":</code>
     * </p>
     * <p>
     * <code>{</code>
     * </p>
     * <p>
     * <code>"InputPathsMap": {"instance": "$.detail.instance","status": "$.detail.status"},</code>
     * </p>
     * <p>
     * <code>"InputTemplate": "&lt;instance&gt; is in state &lt;status&gt;"</code>
     * </p>
     * <p>
     * <code>}</code>
     * </p>
     * <p>
     * To have the <code>InputTemplate</code> include quote marks within a JSON string, escape each quote marks with a
     * slash, as in the following example:
     * </p>
     * <p>
     * <code> "InputTransformer":</code>
     * </p>
     * <p>
     * <code>{</code>
     * </p>
     * <p>
     * <code>"InputPathsMap": {"instance": "$.detail.instance","status": "$.detail.status"},</code>
     * </p>
     * <p>
     * <code>"InputTemplate": "&lt;instance&gt; is in state \"&lt;status&gt;\""</code>
     * </p>
     * <p>
     * <code>}</code>
     * </p>
     * 
     * @return Input template where you specify placeholders that will be filled with the values of the keys from
     *         <code>InputPathsMap</code> to customize the data sent to the target. Enclose each
     *         <code>InputPathsMaps</code> value in brackets: &lt;<i>value</i>&gt; The InputTemplate must be valid
     *         JSON.</p>
     *         <p>
     *         If <code>InputTemplate</code> is a JSON object (surrounded by curly braces), the following restrictions
     *         apply:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The placeholder cannot be used as an object key.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Object values cannot include quote marks.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The following example shows the syntax for using <code>InputPathsMap</code> and
     *         <code>InputTemplate</code>.
     *         </p>
     *         <p>
     *         <code> "InputTransformer":</code>
     *         </p>
     *         <p>
     *         <code>{</code>
     *         </p>
     *         <p>
     *         <code>"InputPathsMap": {"instance": "$.detail.instance","status": "$.detail.status"},</code>
     *         </p>
     *         <p>
     *         <code>"InputTemplate": "&lt;instance&gt; is in state &lt;status&gt;"</code>
     *         </p>
     *         <p>
     *         <code>}</code>
     *         </p>
     *         <p>
     *         To have the <code>InputTemplate</code> include quote marks within a JSON string, escape each quote marks
     *         with a slash, as in the following example:
     *         </p>
     *         <p>
     *         <code> "InputTransformer":</code>
     *         </p>
     *         <p>
     *         <code>{</code>
     *         </p>
     *         <p>
     *         <code>"InputPathsMap": {"instance": "$.detail.instance","status": "$.detail.status"},</code>
     *         </p>
     *         <p>
     *         <code>"InputTemplate": "&lt;instance&gt; is in state \"&lt;status&gt;\""</code>
     *         </p>
     *         <p>
     *         <code>}</code>
     */

    public String getInputTemplate() {
        return this.inputTemplate;
    }

    /**
     * <p>
     * Input template where you specify placeholders that will be filled with the values of the keys from
     * <code>InputPathsMap</code> to customize the data sent to the target. Enclose each <code>InputPathsMaps</code>
     * value in brackets: &lt;<i>value</i>&gt; The InputTemplate must be valid JSON.
     * </p>
     * <p>
     * If <code>InputTemplate</code> is a JSON object (surrounded by curly braces), the following restrictions apply:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The placeholder cannot be used as an object key.
     * </p>
     * </li>
     * <li>
     * <p>
     * Object values cannot include quote marks.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following example shows the syntax for using <code>InputPathsMap</code> and <code>InputTemplate</code>.
     * </p>
     * <p>
     * <code> "InputTransformer":</code>
     * </p>
     * <p>
     * <code>{</code>
     * </p>
     * <p>
     * <code>"InputPathsMap": {"instance": "$.detail.instance","status": "$.detail.status"},</code>
     * </p>
     * <p>
     * <code>"InputTemplate": "&lt;instance&gt; is in state &lt;status&gt;"</code>
     * </p>
     * <p>
     * <code>}</code>
     * </p>
     * <p>
     * To have the <code>InputTemplate</code> include quote marks within a JSON string, escape each quote marks with a
     * slash, as in the following example:
     * </p>
     * <p>
     * <code> "InputTransformer":</code>
     * </p>
     * <p>
     * <code>{</code>
     * </p>
     * <p>
     * <code>"InputPathsMap": {"instance": "$.detail.instance","status": "$.detail.status"},</code>
     * </p>
     * <p>
     * <code>"InputTemplate": "&lt;instance&gt; is in state \"&lt;status&gt;\""</code>
     * </p>
     * <p>
     * <code>}</code>
     * </p>
     * 
     * @param inputTemplate
     *        Input template where you specify placeholders that will be filled with the values of the keys from
     *        <code>InputPathsMap</code> to customize the data sent to the target. Enclose each
     *        <code>InputPathsMaps</code> value in brackets: &lt;<i>value</i>&gt; The InputTemplate must be valid
     *        JSON.</p>
     *        <p>
     *        If <code>InputTemplate</code> is a JSON object (surrounded by curly braces), the following restrictions
     *        apply:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The placeholder cannot be used as an object key.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Object values cannot include quote marks.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following example shows the syntax for using <code>InputPathsMap</code> and <code>InputTemplate</code>
     *        .
     *        </p>
     *        <p>
     *        <code> "InputTransformer":</code>
     *        </p>
     *        <p>
     *        <code>{</code>
     *        </p>
     *        <p>
     *        <code>"InputPathsMap": {"instance": "$.detail.instance","status": "$.detail.status"},</code>
     *        </p>
     *        <p>
     *        <code>"InputTemplate": "&lt;instance&gt; is in state &lt;status&gt;"</code>
     *        </p>
     *        <p>
     *        <code>}</code>
     *        </p>
     *        <p>
     *        To have the <code>InputTemplate</code> include quote marks within a JSON string, escape each quote marks
     *        with a slash, as in the following example:
     *        </p>
     *        <p>
     *        <code> "InputTransformer":</code>
     *        </p>
     *        <p>
     *        <code>{</code>
     *        </p>
     *        <p>
     *        <code>"InputPathsMap": {"instance": "$.detail.instance","status": "$.detail.status"},</code>
     *        </p>
     *        <p>
     *        <code>"InputTemplate": "&lt;instance&gt; is in state \"&lt;status&gt;\""</code>
     *        </p>
     *        <p>
     *        <code>}</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputTransformer withInputTemplate(String inputTemplate) {
        setInputTemplate(inputTemplate);
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
        if (getInputPathsMap() != null)
            sb.append("InputPathsMap: ").append(getInputPathsMap()).append(",");
        if (getInputTemplate() != null)
            sb.append("InputTemplate: ").append(getInputTemplate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputTransformer == false)
            return false;
        InputTransformer other = (InputTransformer) obj;
        if (other.getInputPathsMap() == null ^ this.getInputPathsMap() == null)
            return false;
        if (other.getInputPathsMap() != null && other.getInputPathsMap().equals(this.getInputPathsMap()) == false)
            return false;
        if (other.getInputTemplate() == null ^ this.getInputTemplate() == null)
            return false;
        if (other.getInputTemplate() != null && other.getInputTemplate().equals(this.getInputTemplate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputPathsMap() == null) ? 0 : getInputPathsMap().hashCode());
        hashCode = prime * hashCode + ((getInputTemplate() == null) ? 0 : getInputTemplate().hashCode());
        return hashCode;
    }

    @Override
    public InputTransformer clone() {
        try {
            return (InputTransformer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevents.model.transform.InputTransformerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
