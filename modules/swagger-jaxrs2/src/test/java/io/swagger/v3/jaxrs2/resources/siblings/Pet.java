package io.swagger.v3.jaxrs2.resources.siblings;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Pet")
public class Pet {
    private Category category;

    @Schema(description = "child")
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

}
