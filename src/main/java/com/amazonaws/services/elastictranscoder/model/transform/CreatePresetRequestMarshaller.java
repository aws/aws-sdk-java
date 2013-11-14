/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elastictranscoder.model.transform;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elastictranscoder.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * Create Preset Request Marshaller
 */
public class CreatePresetRequestMarshaller implements Marshaller<Request<CreatePresetRequest>, CreatePresetRequest> {

    

    public Request<CreatePresetRequest> marshall(CreatePresetRequest createPresetRequest) {
    if (createPresetRequest == null) {
        throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

        Request<CreatePresetRequest> request = new DefaultRequest<CreatePresetRequest>(createPresetRequest, "AmazonElasticTranscoder");
        String target = "EtsCustomerService.CreatePreset";
        request.addHeader("X-Amz-Target", target);
        request.addHeader("Content-Type", "application/x-amz-json-1.0");

        
        request.setHttpMethod(HttpMethodName.POST);


        String uriResourcePath = "2012-09-25/presets"; 

        uriResourcePath = uriResourcePath.replaceAll("//", "/");

        if (uriResourcePath.contains("?")) {
            String queryString = uriResourcePath.substring(uriResourcePath.indexOf("?") + 1);
            uriResourcePath    = uriResourcePath.substring(0, uriResourcePath.indexOf("?"));

            for (String s : queryString.split("[;&]")) {
                String[] nameValuePair = s.split("=");
                if (nameValuePair.length == 2) {
                    request.addParameter(nameValuePair[0], nameValuePair[1]);
                } else {
                    request.addParameter(s, null);
                }
            }
        }

        request.setResourcePath(uriResourcePath);


        
        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          
            
          jsonWriter.object();
          
            if (createPresetRequest.getName() != null) {
                jsonWriter.key("Name").value(createPresetRequest.getName());
            }
            if (createPresetRequest.getDescription() != null) {
                jsonWriter.key("Description").value(createPresetRequest.getDescription());
            }
            if (createPresetRequest.getContainer() != null) {
                jsonWriter.key("Container").value(createPresetRequest.getContainer());
            }
            VideoParameters video = createPresetRequest.getVideo();
            if (video != null) {

                jsonWriter.key("Video");
                jsonWriter.object();

                if (video.getCodec() != null) {
                    jsonWriter.key("Codec").value(video.getCodec());
                }
                if (video.getCodecOptions() != null) {
                    jsonWriter.key("CodecOptions");
                    jsonWriter.object();
                    for (Map.Entry<String, String> codecOptionsListValue : video.getCodecOptions().entrySet()) {
                        if (codecOptionsListValue.getValue() != null) {
                            jsonWriter.key(codecOptionsListValue.getKey());

                            jsonWriter.value(codecOptionsListValue.getValue());
                        }
                    }
                    jsonWriter.endObject();
                }
                if (video.getKeyframesMaxDist() != null) {
                    jsonWriter.key("KeyframesMaxDist").value(video.getKeyframesMaxDist());
                }
                if (video.getFixedGOP() != null) {
                    jsonWriter.key("FixedGOP").value(video.getFixedGOP());
                }
                if (video.getBitRate() != null) {
                    jsonWriter.key("BitRate").value(video.getBitRate());
                }
                if (video.getFrameRate() != null) {
                    jsonWriter.key("FrameRate").value(video.getFrameRate());
                }
                if (video.getMaxFrameRate() != null) {
                    jsonWriter.key("MaxFrameRate").value(video.getMaxFrameRate());
                }
                if (video.getResolution() != null) {
                    jsonWriter.key("Resolution").value(video.getResolution());
                }
                if (video.getAspectRatio() != null) {
                    jsonWriter.key("AspectRatio").value(video.getAspectRatio());
                }
                if (video.getMaxWidth() != null) {
                    jsonWriter.key("MaxWidth").value(video.getMaxWidth());
                }
                if (video.getMaxHeight() != null) {
                    jsonWriter.key("MaxHeight").value(video.getMaxHeight());
                }
                if (video.getDisplayAspectRatio() != null) {
                    jsonWriter.key("DisplayAspectRatio").value(video.getDisplayAspectRatio());
                }
                if (video.getSizingPolicy() != null) {
                    jsonWriter.key("SizingPolicy").value(video.getSizingPolicy());
                }
                if (video.getPaddingPolicy() != null) {
                    jsonWriter.key("PaddingPolicy").value(video.getPaddingPolicy());
                }

                com.amazonaws.internal.ListWithAutoConstructFlag<PresetWatermark> watermarksList = (com.amazonaws.internal.ListWithAutoConstructFlag<PresetWatermark>)(video.getWatermarks());
                if (watermarksList != null && !(watermarksList.isAutoConstruct() && watermarksList.isEmpty())) {

                    jsonWriter.key("Watermarks");
                    jsonWriter.array();

                    for (PresetWatermark watermarksListValue : watermarksList) {
                        if (watermarksListValue != null) {
                            jsonWriter.object();
                            if (watermarksListValue.getId() != null) {
                                jsonWriter.key("Id").value(watermarksListValue.getId());
                            }
                            if (watermarksListValue.getMaxWidth() != null) {
                                jsonWriter.key("MaxWidth").value(watermarksListValue.getMaxWidth());
                            }
                            if (watermarksListValue.getMaxHeight() != null) {
                                jsonWriter.key("MaxHeight").value(watermarksListValue.getMaxHeight());
                            }
                            if (watermarksListValue.getSizingPolicy() != null) {
                                jsonWriter.key("SizingPolicy").value(watermarksListValue.getSizingPolicy());
                            }
                            if (watermarksListValue.getHorizontalAlign() != null) {
                                jsonWriter.key("HorizontalAlign").value(watermarksListValue.getHorizontalAlign());
                            }
                            if (watermarksListValue.getHorizontalOffset() != null) {
                                jsonWriter.key("HorizontalOffset").value(watermarksListValue.getHorizontalOffset());
                            }
                            if (watermarksListValue.getVerticalAlign() != null) {
                                jsonWriter.key("VerticalAlign").value(watermarksListValue.getVerticalAlign());
                            }
                            if (watermarksListValue.getVerticalOffset() != null) {
                                jsonWriter.key("VerticalOffset").value(watermarksListValue.getVerticalOffset());
                            }
                            if (watermarksListValue.getOpacity() != null) {
                                jsonWriter.key("Opacity").value(watermarksListValue.getOpacity());
                            }
                            if (watermarksListValue.getTarget() != null) {
                                jsonWriter.key("Target").value(watermarksListValue.getTarget());
                            }
                            jsonWriter.endObject();
                        }
                    }
                    jsonWriter.endArray();
                }
                jsonWriter.endObject();
            }
            AudioParameters audio = createPresetRequest.getAudio();
            if (audio != null) {

                jsonWriter.key("Audio");
                jsonWriter.object();

                if (audio.getCodec() != null) {
                    jsonWriter.key("Codec").value(audio.getCodec());
                }
                if (audio.getSampleRate() != null) {
                    jsonWriter.key("SampleRate").value(audio.getSampleRate());
                }
                if (audio.getBitRate() != null) {
                    jsonWriter.key("BitRate").value(audio.getBitRate());
                }
                if (audio.getChannels() != null) {
                    jsonWriter.key("Channels").value(audio.getChannels());
                }
                jsonWriter.endObject();
            }
            Thumbnails thumbnails = createPresetRequest.getThumbnails();
            if (thumbnails != null) {

                jsonWriter.key("Thumbnails");
                jsonWriter.object();

                if (thumbnails.getFormat() != null) {
                    jsonWriter.key("Format").value(thumbnails.getFormat());
                }
                if (thumbnails.getInterval() != null) {
                    jsonWriter.key("Interval").value(thumbnails.getInterval());
                }
                if (thumbnails.getResolution() != null) {
                    jsonWriter.key("Resolution").value(thumbnails.getResolution());
                }
                if (thumbnails.getAspectRatio() != null) {
                    jsonWriter.key("AspectRatio").value(thumbnails.getAspectRatio());
                }
                if (thumbnails.getMaxWidth() != null) {
                    jsonWriter.key("MaxWidth").value(thumbnails.getMaxWidth());
                }
                if (thumbnails.getMaxHeight() != null) {
                    jsonWriter.key("MaxHeight").value(thumbnails.getMaxHeight());
                }
                if (thumbnails.getSizingPolicy() != null) {
                    jsonWriter.key("SizingPolicy").value(thumbnails.getSizingPolicy());
                }
                if (thumbnails.getPaddingPolicy() != null) {
                    jsonWriter.key("PaddingPolicy").value(thumbnails.getPaddingPolicy());
                }
                jsonWriter.endObject();
            }

          jsonWriter.endObject();
          

          String snippet = stringWriter.toString();
          byte[] content = snippet.getBytes("UTF-8");
          request.setContent(new StringInputStream(snippet));
          request.addHeader("Content-Length", Integer.toString(content.length));
        } catch(Throwable t) {
          throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        

        return request;
    }
}
