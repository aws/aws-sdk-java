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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/GetMetricWidgetImage" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMetricWidgetImageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A JSON string that defines the bitmap graph to be retrieved. The string includes the metrics to include in the
     * graph, statistics, annotations, title, axis limits, and so on. You can include only one <code>MetricWidget</code>
     * parameter in each <code>GetMetricWidgetImage</code> call.
     * </p>
     * <p>
     * For more information about the syntax of <code>MetricWidget</code> see <a>CloudWatch-Metric-Widget-Structure</a>.
     * </p>
     * <p>
     * If any metric on the graph could not load all the requested data points, an orange triangle with an exclamation
     * point appears next to the graph legend.
     * </p>
     */
    private String metricWidget;
    /**
     * <p>
     * The format of the resulting image. Only PNG images are supported.
     * </p>
     * <p>
     * The default is <code>png</code>. If you specify <code>png</code>, the API returns an HTTP response with the
     * content-type set to <code>text/xml</code>. The image data is in a <code>MetricWidgetImage</code> field. For
     * example:
     * </p>
     * <p>
     * <code> &lt;GetMetricWidgetImageResponse xmlns=&lt;URLstring&gt;&gt;</code>
     * </p>
     * <p>
     * <code> &lt;GetMetricWidgetImageResult&gt;</code>
     * </p>
     * <p>
     * <code> &lt;MetricWidgetImage&gt;</code>
     * </p>
     * <p>
     * <code> iVBORw0KGgoAAAANSUhEUgAAAlgAAAGQEAYAAAAip...</code>
     * </p>
     * <p>
     * <code> &lt;/MetricWidgetImage&gt;</code>
     * </p>
     * <p>
     * <code> &lt;/GetMetricWidgetImageResult&gt;</code>
     * </p>
     * <p>
     * <code> &lt;ResponseMetadata&gt;</code>
     * </p>
     * <p>
     * <code> &lt;RequestId&gt;6f0d4192-4d42-11e8-82c1-f539a07e0e3b&lt;/RequestId&gt;</code>
     * </p>
     * <p>
     * <code> &lt;/ResponseMetadata&gt;</code>
     * </p>
     * <p>
     * <code>&lt;/GetMetricWidgetImageResponse&gt;</code>
     * </p>
     * <p>
     * The <code>image/png</code> setting is intended only for custom HTTP requests. For most use cases, and all actions
     * using an AWS SDK, you should use <code>png</code>. If you specify <code>image/png</code>, the HTTP response has a
     * content-type set to <code>image/png</code>, and the body of the response is a PNG image.
     * </p>
     */
    private String outputFormat;

    /**
     * <p>
     * A JSON string that defines the bitmap graph to be retrieved. The string includes the metrics to include in the
     * graph, statistics, annotations, title, axis limits, and so on. You can include only one <code>MetricWidget</code>
     * parameter in each <code>GetMetricWidgetImage</code> call.
     * </p>
     * <p>
     * For more information about the syntax of <code>MetricWidget</code> see <a>CloudWatch-Metric-Widget-Structure</a>.
     * </p>
     * <p>
     * If any metric on the graph could not load all the requested data points, an orange triangle with an exclamation
     * point appears next to the graph legend.
     * </p>
     * 
     * @param metricWidget
     *        A JSON string that defines the bitmap graph to be retrieved. The string includes the metrics to include in
     *        the graph, statistics, annotations, title, axis limits, and so on. You can include only one
     *        <code>MetricWidget</code> parameter in each <code>GetMetricWidgetImage</code> call.</p>
     *        <p>
     *        For more information about the syntax of <code>MetricWidget</code> see
     *        <a>CloudWatch-Metric-Widget-Structure</a>.
     *        </p>
     *        <p>
     *        If any metric on the graph could not load all the requested data points, an orange triangle with an
     *        exclamation point appears next to the graph legend.
     */

    public void setMetricWidget(String metricWidget) {
        this.metricWidget = metricWidget;
    }

    /**
     * <p>
     * A JSON string that defines the bitmap graph to be retrieved. The string includes the metrics to include in the
     * graph, statistics, annotations, title, axis limits, and so on. You can include only one <code>MetricWidget</code>
     * parameter in each <code>GetMetricWidgetImage</code> call.
     * </p>
     * <p>
     * For more information about the syntax of <code>MetricWidget</code> see <a>CloudWatch-Metric-Widget-Structure</a>.
     * </p>
     * <p>
     * If any metric on the graph could not load all the requested data points, an orange triangle with an exclamation
     * point appears next to the graph legend.
     * </p>
     * 
     * @return A JSON string that defines the bitmap graph to be retrieved. The string includes the metrics to include
     *         in the graph, statistics, annotations, title, axis limits, and so on. You can include only one
     *         <code>MetricWidget</code> parameter in each <code>GetMetricWidgetImage</code> call.</p>
     *         <p>
     *         For more information about the syntax of <code>MetricWidget</code> see
     *         <a>CloudWatch-Metric-Widget-Structure</a>.
     *         </p>
     *         <p>
     *         If any metric on the graph could not load all the requested data points, an orange triangle with an
     *         exclamation point appears next to the graph legend.
     */

    public String getMetricWidget() {
        return this.metricWidget;
    }

    /**
     * <p>
     * A JSON string that defines the bitmap graph to be retrieved. The string includes the metrics to include in the
     * graph, statistics, annotations, title, axis limits, and so on. You can include only one <code>MetricWidget</code>
     * parameter in each <code>GetMetricWidgetImage</code> call.
     * </p>
     * <p>
     * For more information about the syntax of <code>MetricWidget</code> see <a>CloudWatch-Metric-Widget-Structure</a>.
     * </p>
     * <p>
     * If any metric on the graph could not load all the requested data points, an orange triangle with an exclamation
     * point appears next to the graph legend.
     * </p>
     * 
     * @param metricWidget
     *        A JSON string that defines the bitmap graph to be retrieved. The string includes the metrics to include in
     *        the graph, statistics, annotations, title, axis limits, and so on. You can include only one
     *        <code>MetricWidget</code> parameter in each <code>GetMetricWidgetImage</code> call.</p>
     *        <p>
     *        For more information about the syntax of <code>MetricWidget</code> see
     *        <a>CloudWatch-Metric-Widget-Structure</a>.
     *        </p>
     *        <p>
     *        If any metric on the graph could not load all the requested data points, an orange triangle with an
     *        exclamation point appears next to the graph legend.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricWidgetImageRequest withMetricWidget(String metricWidget) {
        setMetricWidget(metricWidget);
        return this;
    }

    /**
     * <p>
     * The format of the resulting image. Only PNG images are supported.
     * </p>
     * <p>
     * The default is <code>png</code>. If you specify <code>png</code>, the API returns an HTTP response with the
     * content-type set to <code>text/xml</code>. The image data is in a <code>MetricWidgetImage</code> field. For
     * example:
     * </p>
     * <p>
     * <code> &lt;GetMetricWidgetImageResponse xmlns=&lt;URLstring&gt;&gt;</code>
     * </p>
     * <p>
     * <code> &lt;GetMetricWidgetImageResult&gt;</code>
     * </p>
     * <p>
     * <code> &lt;MetricWidgetImage&gt;</code>
     * </p>
     * <p>
     * <code> iVBORw0KGgoAAAANSUhEUgAAAlgAAAGQEAYAAAAip...</code>
     * </p>
     * <p>
     * <code> &lt;/MetricWidgetImage&gt;</code>
     * </p>
     * <p>
     * <code> &lt;/GetMetricWidgetImageResult&gt;</code>
     * </p>
     * <p>
     * <code> &lt;ResponseMetadata&gt;</code>
     * </p>
     * <p>
     * <code> &lt;RequestId&gt;6f0d4192-4d42-11e8-82c1-f539a07e0e3b&lt;/RequestId&gt;</code>
     * </p>
     * <p>
     * <code> &lt;/ResponseMetadata&gt;</code>
     * </p>
     * <p>
     * <code>&lt;/GetMetricWidgetImageResponse&gt;</code>
     * </p>
     * <p>
     * The <code>image/png</code> setting is intended only for custom HTTP requests. For most use cases, and all actions
     * using an AWS SDK, you should use <code>png</code>. If you specify <code>image/png</code>, the HTTP response has a
     * content-type set to <code>image/png</code>, and the body of the response is a PNG image.
     * </p>
     * 
     * @param outputFormat
     *        The format of the resulting image. Only PNG images are supported.</p>
     *        <p>
     *        The default is <code>png</code>. If you specify <code>png</code>, the API returns an HTTP response with
     *        the content-type set to <code>text/xml</code>. The image data is in a <code>MetricWidgetImage</code>
     *        field. For example:
     *        </p>
     *        <p>
     *        <code> &lt;GetMetricWidgetImageResponse xmlns=&lt;URLstring&gt;&gt;</code>
     *        </p>
     *        <p>
     *        <code> &lt;GetMetricWidgetImageResult&gt;</code>
     *        </p>
     *        <p>
     *        <code> &lt;MetricWidgetImage&gt;</code>
     *        </p>
     *        <p>
     *        <code> iVBORw0KGgoAAAANSUhEUgAAAlgAAAGQEAYAAAAip...</code>
     *        </p>
     *        <p>
     *        <code> &lt;/MetricWidgetImage&gt;</code>
     *        </p>
     *        <p>
     *        <code> &lt;/GetMetricWidgetImageResult&gt;</code>
     *        </p>
     *        <p>
     *        <code> &lt;ResponseMetadata&gt;</code>
     *        </p>
     *        <p>
     *        <code> &lt;RequestId&gt;6f0d4192-4d42-11e8-82c1-f539a07e0e3b&lt;/RequestId&gt;</code>
     *        </p>
     *        <p>
     *        <code> &lt;/ResponseMetadata&gt;</code>
     *        </p>
     *        <p>
     *        <code>&lt;/GetMetricWidgetImageResponse&gt;</code>
     *        </p>
     *        <p>
     *        The <code>image/png</code> setting is intended only for custom HTTP requests. For most use cases, and all
     *        actions using an AWS SDK, you should use <code>png</code>. If you specify <code>image/png</code>, the HTTP
     *        response has a content-type set to <code>image/png</code>, and the body of the response is a PNG image.
     */

    public void setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
    }

    /**
     * <p>
     * The format of the resulting image. Only PNG images are supported.
     * </p>
     * <p>
     * The default is <code>png</code>. If you specify <code>png</code>, the API returns an HTTP response with the
     * content-type set to <code>text/xml</code>. The image data is in a <code>MetricWidgetImage</code> field. For
     * example:
     * </p>
     * <p>
     * <code> &lt;GetMetricWidgetImageResponse xmlns=&lt;URLstring&gt;&gt;</code>
     * </p>
     * <p>
     * <code> &lt;GetMetricWidgetImageResult&gt;</code>
     * </p>
     * <p>
     * <code> &lt;MetricWidgetImage&gt;</code>
     * </p>
     * <p>
     * <code> iVBORw0KGgoAAAANSUhEUgAAAlgAAAGQEAYAAAAip...</code>
     * </p>
     * <p>
     * <code> &lt;/MetricWidgetImage&gt;</code>
     * </p>
     * <p>
     * <code> &lt;/GetMetricWidgetImageResult&gt;</code>
     * </p>
     * <p>
     * <code> &lt;ResponseMetadata&gt;</code>
     * </p>
     * <p>
     * <code> &lt;RequestId&gt;6f0d4192-4d42-11e8-82c1-f539a07e0e3b&lt;/RequestId&gt;</code>
     * </p>
     * <p>
     * <code> &lt;/ResponseMetadata&gt;</code>
     * </p>
     * <p>
     * <code>&lt;/GetMetricWidgetImageResponse&gt;</code>
     * </p>
     * <p>
     * The <code>image/png</code> setting is intended only for custom HTTP requests. For most use cases, and all actions
     * using an AWS SDK, you should use <code>png</code>. If you specify <code>image/png</code>, the HTTP response has a
     * content-type set to <code>image/png</code>, and the body of the response is a PNG image.
     * </p>
     * 
     * @return The format of the resulting image. Only PNG images are supported.</p>
     *         <p>
     *         The default is <code>png</code>. If you specify <code>png</code>, the API returns an HTTP response with
     *         the content-type set to <code>text/xml</code>. The image data is in a <code>MetricWidgetImage</code>
     *         field. For example:
     *         </p>
     *         <p>
     *         <code> &lt;GetMetricWidgetImageResponse xmlns=&lt;URLstring&gt;&gt;</code>
     *         </p>
     *         <p>
     *         <code> &lt;GetMetricWidgetImageResult&gt;</code>
     *         </p>
     *         <p>
     *         <code> &lt;MetricWidgetImage&gt;</code>
     *         </p>
     *         <p>
     *         <code> iVBORw0KGgoAAAANSUhEUgAAAlgAAAGQEAYAAAAip...</code>
     *         </p>
     *         <p>
     *         <code> &lt;/MetricWidgetImage&gt;</code>
     *         </p>
     *         <p>
     *         <code> &lt;/GetMetricWidgetImageResult&gt;</code>
     *         </p>
     *         <p>
     *         <code> &lt;ResponseMetadata&gt;</code>
     *         </p>
     *         <p>
     *         <code> &lt;RequestId&gt;6f0d4192-4d42-11e8-82c1-f539a07e0e3b&lt;/RequestId&gt;</code>
     *         </p>
     *         <p>
     *         <code> &lt;/ResponseMetadata&gt;</code>
     *         </p>
     *         <p>
     *         <code>&lt;/GetMetricWidgetImageResponse&gt;</code>
     *         </p>
     *         <p>
     *         The <code>image/png</code> setting is intended only for custom HTTP requests. For most use cases, and all
     *         actions using an AWS SDK, you should use <code>png</code>. If you specify <code>image/png</code>, the
     *         HTTP response has a content-type set to <code>image/png</code>, and the body of the response is a PNG
     *         image.
     */

    public String getOutputFormat() {
        return this.outputFormat;
    }

    /**
     * <p>
     * The format of the resulting image. Only PNG images are supported.
     * </p>
     * <p>
     * The default is <code>png</code>. If you specify <code>png</code>, the API returns an HTTP response with the
     * content-type set to <code>text/xml</code>. The image data is in a <code>MetricWidgetImage</code> field. For
     * example:
     * </p>
     * <p>
     * <code> &lt;GetMetricWidgetImageResponse xmlns=&lt;URLstring&gt;&gt;</code>
     * </p>
     * <p>
     * <code> &lt;GetMetricWidgetImageResult&gt;</code>
     * </p>
     * <p>
     * <code> &lt;MetricWidgetImage&gt;</code>
     * </p>
     * <p>
     * <code> iVBORw0KGgoAAAANSUhEUgAAAlgAAAGQEAYAAAAip...</code>
     * </p>
     * <p>
     * <code> &lt;/MetricWidgetImage&gt;</code>
     * </p>
     * <p>
     * <code> &lt;/GetMetricWidgetImageResult&gt;</code>
     * </p>
     * <p>
     * <code> &lt;ResponseMetadata&gt;</code>
     * </p>
     * <p>
     * <code> &lt;RequestId&gt;6f0d4192-4d42-11e8-82c1-f539a07e0e3b&lt;/RequestId&gt;</code>
     * </p>
     * <p>
     * <code> &lt;/ResponseMetadata&gt;</code>
     * </p>
     * <p>
     * <code>&lt;/GetMetricWidgetImageResponse&gt;</code>
     * </p>
     * <p>
     * The <code>image/png</code> setting is intended only for custom HTTP requests. For most use cases, and all actions
     * using an AWS SDK, you should use <code>png</code>. If you specify <code>image/png</code>, the HTTP response has a
     * content-type set to <code>image/png</code>, and the body of the response is a PNG image.
     * </p>
     * 
     * @param outputFormat
     *        The format of the resulting image. Only PNG images are supported.</p>
     *        <p>
     *        The default is <code>png</code>. If you specify <code>png</code>, the API returns an HTTP response with
     *        the content-type set to <code>text/xml</code>. The image data is in a <code>MetricWidgetImage</code>
     *        field. For example:
     *        </p>
     *        <p>
     *        <code> &lt;GetMetricWidgetImageResponse xmlns=&lt;URLstring&gt;&gt;</code>
     *        </p>
     *        <p>
     *        <code> &lt;GetMetricWidgetImageResult&gt;</code>
     *        </p>
     *        <p>
     *        <code> &lt;MetricWidgetImage&gt;</code>
     *        </p>
     *        <p>
     *        <code> iVBORw0KGgoAAAANSUhEUgAAAlgAAAGQEAYAAAAip...</code>
     *        </p>
     *        <p>
     *        <code> &lt;/MetricWidgetImage&gt;</code>
     *        </p>
     *        <p>
     *        <code> &lt;/GetMetricWidgetImageResult&gt;</code>
     *        </p>
     *        <p>
     *        <code> &lt;ResponseMetadata&gt;</code>
     *        </p>
     *        <p>
     *        <code> &lt;RequestId&gt;6f0d4192-4d42-11e8-82c1-f539a07e0e3b&lt;/RequestId&gt;</code>
     *        </p>
     *        <p>
     *        <code> &lt;/ResponseMetadata&gt;</code>
     *        </p>
     *        <p>
     *        <code>&lt;/GetMetricWidgetImageResponse&gt;</code>
     *        </p>
     *        <p>
     *        The <code>image/png</code> setting is intended only for custom HTTP requests. For most use cases, and all
     *        actions using an AWS SDK, you should use <code>png</code>. If you specify <code>image/png</code>, the HTTP
     *        response has a content-type set to <code>image/png</code>, and the body of the response is a PNG image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricWidgetImageRequest withOutputFormat(String outputFormat) {
        setOutputFormat(outputFormat);
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
        if (getMetricWidget() != null)
            sb.append("MetricWidget: ").append(getMetricWidget()).append(",");
        if (getOutputFormat() != null)
            sb.append("OutputFormat: ").append(getOutputFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMetricWidgetImageRequest == false)
            return false;
        GetMetricWidgetImageRequest other = (GetMetricWidgetImageRequest) obj;
        if (other.getMetricWidget() == null ^ this.getMetricWidget() == null)
            return false;
        if (other.getMetricWidget() != null && other.getMetricWidget().equals(this.getMetricWidget()) == false)
            return false;
        if (other.getOutputFormat() == null ^ this.getOutputFormat() == null)
            return false;
        if (other.getOutputFormat() != null && other.getOutputFormat().equals(this.getOutputFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricWidget() == null) ? 0 : getMetricWidget().hashCode());
        hashCode = prime * hashCode + ((getOutputFormat() == null) ? 0 : getOutputFormat().hashCode());
        return hashCode;
    }

    @Override
    public GetMetricWidgetImageRequest clone() {
        return (GetMetricWidgetImageRequest) super.clone();
    }

}
