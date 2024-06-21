.PHONY: format check

# Format the code with ktlint
format:
	./ktlint.sh format

# Validate the code with ktlint
check:
	./ktlint.sh check
