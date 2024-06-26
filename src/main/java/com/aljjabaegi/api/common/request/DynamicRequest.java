package com.aljjabaegi.api.common.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

import java.util.List;

/**
 * Dynamic Request with filtering, sorting
 *
 * @author GEONLEE
 * @since 2024-04-12<br />
 * 2024-05-02 GEONLEE - @Builder 추가<br />
 */
@Schema(description = "Dynamic Request with filtering, sorting")
@Builder
public record DynamicRequest(
        @Schema(description = "Current page number", example = "0", defaultValue = "0")
        int pageNo,
        @Schema(description = "Number of data in page", example = "10", defaultValue = "10")
        int pageSize,
        @Schema(description = "Filter array")
        List<DynamicFilter> filter,
        @Schema(description = "Sort array")
        List<DynamicSorter> sorter) {
    public DynamicRequest {
        pageSize = (pageSize == 0) ? 10 : pageSize;
    }
}
