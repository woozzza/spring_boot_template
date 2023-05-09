package ai.megaworks.spring_boot_template.common.dto;


public class RequestDto {
    private String keywordType;
    private String keyword;

    protected RequestDto(final RequestDto.RequestDtoBuilder<?, ?> b) {
        this.keywordType = b.keywordType;
        this.keyword = b.keyword;
    }

    public static RequestDto.RequestDtoBuilder<?, ?> builder() {
        return new RequestDto.RequestDtoBuilderImpl();
    }

    public String getKeywordType() {
        return this.keywordType;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public RequestDto() {
    }

    private static final class RequestDtoBuilderImpl
            extends
            RequestDto.RequestDtoBuilder<RequestDto, RequestDto.RequestDtoBuilderImpl> {
        private RequestDtoBuilderImpl() {
        }

        protected RequestDto.RequestDtoBuilderImpl self() {
            return this;
        }

        public RequestDto build() {
            return new RequestDto(this);
        }
    }

    public abstract static class RequestDtoBuilder<C extends RequestDto, B extends RequestDto.RequestDtoBuilder<C, B>> {
        private String keywordType;
        private String keyword;

        protected abstract B self();

        public abstract C build();

        public B keywordType(final String keywordType) {
            this.keywordType = keywordType;
            return this.self();
        }

        public B keyword(final String keyword) {
            this.keyword = keyword;
            return this.self();
        }

        public String toString() {
            return "RequestDto.RequestDtoBuilder(keywordType=" + this.keywordType + ", keyword=" + this.keyword + ")";
        }
    }
}